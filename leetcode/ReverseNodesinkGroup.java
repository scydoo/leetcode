package lee;
/*
 * ÿk���ڲ�����reverse��1->2->3->4->5�� k = 3����3->2->1->4->5
 * ˼·���ݹ顣ÿ�θ���head����k������k + 1�����ɵݹ鷵�ء�
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
