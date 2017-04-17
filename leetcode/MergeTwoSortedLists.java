package lee;

public class MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(-1);
		ListNode f = head;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				f.next = l1;
				f = f.next;
				l1 = l1.next;
			} else {
				f.next = l2;
				f = f.next;
				l2 = l2.next;
			}
		}
		if (l1 != null) {
			f.next = l1;
		}
		if (l2 != null) {
			f.next = l2;
		}
		return head.next;
    }
}
