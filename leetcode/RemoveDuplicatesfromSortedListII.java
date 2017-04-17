package lee;
/*
 * Given 1->2->3->3->4->4->5, return 1->2->5.Given 1->1->1->2->3, return 2->3.
 * ˼·����ָ�롣bug�㣺whileѭ��ʱδ�ж�fast!=null����Ϊ��fastΪnullʱ��
 * ����fast.next����NullPointerException
 */
public class RemoveDuplicatesfromSortedListII {

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) return head;
        ListNode fakehead = new ListNode(-1);
        ListNode slow = fakehead, fast = head;
        fakehead.next = head;
        while (fast != null && fast.next != null) {
        	if (fast.next.val == slow.next.val) {
        		while (fast.next != null && fast.next.val == slow.next.val) {
        			fast = fast.next;
        		}
        		slow.next = fast.next;
        	} else {
        	    slow = slow.next;
        	}
        	
        	fast = fast.next;
        }
        return fakehead.next;
	}

}
