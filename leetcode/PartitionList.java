package lee;
/*
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * 如：1-4-3-2-5-2——>1-2-2-4-3-5
 * 思路：两个list
 */
public class PartitionList {

	public ListNode partition(ListNode head, int x) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode small = new ListNode(-1);
		ListNode newsmallhead = small; // head不存储数据
		ListNode big = new ListNode(-1);
		ListNode newbighead = big;
		while (head != null) {
			if (head.val < x) {
				small.next = head;
				small = small.next;
			} else {
				big.next = head;
				big = big.next;
	          }
			head = head.next;
		}
		big.next = null;
		small.next = newbighead.next;
		return newsmallhead.next;
	}

}
