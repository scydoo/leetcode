package lee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ��46Ψһ������Ԫ�ؿ����ظ�
 * ˼·���ǣ�ֻ�Ե�һ��δ��ʹ�õ������еݹ顣���ظ�ֵֻ�ܳ����ڵݹ��ڲ���
 */
public class PermutationsII {

	public List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> re = new ArrayList<List<Integer>>();
		List<Integer> l = new ArrayList<Integer>();
		boolean[] visited = new boolean[nums.length];
		helper(nums, re, l, visited);
		return re;
	}
	public static void helper(int[] a, List<List<Integer>> re, List<Integer> l, boolean[] v) {
		if (l.size() == a.length && (!re.contains(l))) {
			re.add(new ArrayList(l));
			return;
		}
		for (int i = 0; i < a.length; i++) {
			if (i > 0 && !v[i - 1] && a[i - 1] == a[i])
				continue;
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
