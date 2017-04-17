package lee;

import java.util.ArrayList;
import java.util.List;

/*
 * ���ظ��������������������
 * δbug-freeԭ������boolean[]��ʼ��ȫΪfalse
 */
public class Permutations {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> re = new ArrayList<List<Integer>>();
		List<Integer> l = new ArrayList<Integer>();
		boolean[] visited = new boolean[nums.length];
		
		helper(nums, re, l, visited);
		return re;
	}
	public static void helper(int[] a, List<List<Integer>> re, List<Integer> l, boolean[] v) {
		if (l.size() == a.length) {
			re.add(new ArrayList(l));
			return;
		}
		for (int i = 0; i < a.length; i++) {
			if (!v[i]) {
				l.add(a[i]);
				v[i] = true;
				helper(a, re, l, v);
				l.remove(l.size() - 1);
				v[i] = false;
			}
		}
	}

}
