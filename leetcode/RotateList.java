package lee;
/*
 * 
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.ÿ���㶼����Ųkλ
 * ˼·���γ�һ�������ҵ���head�ٶϿ����ɡ�Ҳ����fast,slow����ָ��
 */
public class RotateList {
	
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null) {
			return head;
		}
        int count = 1;
        ListNode tail= head;
        while (tail.next != null) {
        	count++;
        	tail = tail.next;
        }
        k = k % count;
        if (k == 0) {
        	return head;
        }
        tail.next = head;
        k = count - k;
        for (int i = 1; i <= k; i++) {
        	head = head.next;
        	tail = tail.next;
        }
        tail.next = null;
        return head;
    }

}
