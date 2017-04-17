package lee;
/*
 * 相加两个非空的linked lists，每个节点只有一位（需进位） 
 * 思路：循环中，进位分开和l1.val、l2.val相加（长度不一）。
 * 新链表至少两指针，其长度可能大于l1或l2（进位）
 */
public class AddTwoNumbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = new ListNode(0);
		ListNode p = res;
		int carry = 0;
		while(l1 != null || l2 != null || carry != 0) { // bug point
			if (l1 != null) {
				carry += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				carry += l2.val;
				l2 = l2.next;
			}
			p.next = new ListNode(carry % 10);
			carry /= 10;
			p = p.next;
		}
		return res.next;
	}

}
