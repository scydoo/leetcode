package lee;
/*
 * swap every two adjacent nodes and return its head£¨1->2->3->4¡ª¡ª>2->1->4->3£©
 */
public class SwapNodesinPairs {

	public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
        	return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
        	ListNode l1 = cur.next;
        	ListNode l2 = cur.next.next;
        	l1.next = l2.next;
        	cur.next = l2;
        	l2.next = l1;
        	cur = cur.next.next;
        }
        return dummy.next;
    }
}
