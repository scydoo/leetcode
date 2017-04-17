package lee;
/*
 * 
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.每个点都往右挪k位
 * 思路：形成一个环，找到新head再断开即可。也可以fast,slow两个指针
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
