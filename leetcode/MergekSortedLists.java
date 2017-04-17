package lee;
/*
 * ˼·��k������ĺϲ�������û��̫���������Ҫ�Ĳ������һ��Ҫ���k��Ԫ�ص���Сֵ��
 * ÿ������Сֵ��k��Ԫ����ʵ���������֮��ֻ��仯һ��������˿�������С�ѡ�  
 */
public class MergekSortedLists {

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0)
			return null;
		if (lists.length == 1)
			return lists[0];
		PriorityQueue<ListNode> heap = new PriorityQueue<>(new Comparator<ListNode>() {
			public int compare(ListNode o1, ListNode o2) {
				return o1.val - o2.val;
			}
		});
		ListNode head = new ListNode(0), rear = head;
		head.next = null;
		for (ListNode node : lists) {
		      if (node != null)
				heap.offer(node); // add
		}

		while (!heap.isEmpty()) {
			rear.next = heap.poll();
			rear = rear.next;
			if (rear.next != null)
				heap.offer(rear.next); // �ӵڶ���node��ʼ����һ������
		}
		rear.next = null;
		return head.next;
	}
}
