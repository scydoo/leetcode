package lee;
/*
 * fast,slow
 * Ҫ����nС����������������������nΪ0
 */
public class RemoveNthNodeFromEndofList {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return head;
		}
		int count = 1;
		ListNode fakeHead = new ListNode(-1);
		fakeHead.next = head;
		ListNode fast = head, slow = fakeHead;
		while (count < n) {
			fast = fast.next;
			count++;
		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return fakeHead.next;
	}
}
