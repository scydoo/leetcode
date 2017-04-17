package lee;
/*
 * 每k个内部进行reverse，1->2->3->4->5， k = 3，则3->2->1->4->5
 * 思路：递归。每次更新head到第k个，第k + 1个已由递归返回。
 */
public class ReverseNodesinkGroup {

	public ListNode reverseKGroup2(ListNode head, int k) {
	    ListNode cur = head;
	    int count = 0;
	    while (cur != null && count != k) {
	        cur = cur.next;
	        count++;
	    }
	    if (count == k) {
	        cur = reverseKGroup(cur, k);
	        while (count-- > 0) { 
	            ListNode tmp = head.next;
	            head.next = cur; 
	            cur = head;
	            head = tmp; 
	        }
	        head = cur; // do not forget
	    }
	    return head;
	}
}
