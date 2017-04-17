package lee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * given candidate set [2, 3, 6, 7] and target 7, 
 * A solution set is: 
 * [[7],[2, 2, 3]]（每个数可以使用多次）
 */
public class CombinationSum {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		Arrays.sort(candidates);
		getCombination(candidates,target,0,0,res,temp);
		return res; 
    }
	public static void getCombination(int[] candidates, int target, int sum, int level, List<List<Integer>> res, List<Integer> temp) {
		if (sum > target) {
			return;
		} else if (sum == target) {
			res.add(new ArrayList<>(temp)); // bug point
			return;
		}
		for (int i = level; i < candidates.length; i++) {
			temp.add(candidates[i]);
			getCombination(candidates, target, sum + candidates[i], i, res, temp);
			temp.remove(temp.size() - 1);
		}
	}

}
