package lee;
/*
 * 思路：k个链表的合并和两个没有太大的区别，主要的差别在于一次要求解k个元素的最小值。
 * 每次求最小值的k个元素其实在两次求解之间只会变化一个数，因此可以用最小堆。  
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
				heap.offer(rear.next); // 从第二个node开始又是一个新链
		}
		rear.next = null;
		return head.next;
	}
}
