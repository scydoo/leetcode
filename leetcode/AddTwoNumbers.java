package lee;
/*
 * ��������ǿյ�linked lists��ÿ���ڵ�ֻ��һλ�����λ�� 
 * ˼·��ѭ���У���λ�ֿ���l1.val��l2.val��ӣ����Ȳ�һ����
 * ������������ָ�룬�䳤�ȿ��ܴ���l1��l2����λ��
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
