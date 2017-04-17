package lee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * [10, 1, 2, 7, 6, 1, 5] and target 8, 
 * A solution set is: [[1, 7],[1, 2, 5],[2, 6],[1, 1, 6]]
 * 区别于上一个，每个数只使用一次
 */
public class CombinationSumII {

	 public List<List<Integer>> combinationSum2(int[] candidates, int target) {
			List<List<Integer>> re = new ArrayList<List<Integer>>();
	        if (candidates.length < 1) {
	        	return re;
	        }
	        Arrays.sort(candidates);
	        helper(candidates, target, 0, new ArrayList<Integer>(), re, 0);
	        return re;
	    }
		public static void helper(int[] a, int target, int sum, List<Integer> l, List<List<Integer>> re, int level) {
			if (sum > target) {
				return;
			} else if (sum == target) {
				re.add(new ArrayList<Integer>(l));
				return;
			}
			for (int i = level; i < a.length; i++) {
				if (i > level && a[i] == a[i - 1]) { // important
					continue;
				}
				l.add(l.size(), a[i]);
				helper(a, target, sum + a[i], l, re, i + 1);
				l.remove(l.size() - 1);
			}
		}

}
