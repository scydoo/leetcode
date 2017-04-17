package lee;
/*
 * Given 1->1->2, return 1->2.Given 1->1->2->3->3, return 1->2->3.
 * ��һ���ڵ㲻�䣬����Ҫfakehead
 */
public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) return head;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null) {
        	if (fast.val == slow.val) {
        		slow.next = fast.next;
        		fast = slow.next;
        	} else {
        		fast = fast.next;
        		slow = slow.next;
        	}
        }
        return head;
    }

}
