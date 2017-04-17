package lee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 和上一题不同的是，数组可能有重复值。如：If nums = [1,2,2], a solution is:[  [2],  [1],  [1,2,2],  [2,2],  [1,2],  []]
 * 思路：重复的数只能递归进入，不可循环
 */
public class SubsetsII {

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
	        List<List<Integer>> re = new ArrayList<List<Integer>>();
		re.add(new ArrayList<Integer>());
	        if(nums.length < 1) return re;
	        for(int i = 0; i < nums.length; i++) {
	        	if(i >0 && nums[i] == nums[i - 1]) continue;
	        	List<Integer> list = new ArrayList<Integer>();
	        	list.add(nums[i]);
	        	re.add(list);
	        	List<List<Integer>> re0 = new ArrayList<List<Integer>>();
	        	re0 = helper(list,re0, nums, i + 1);
	        	re.addAll(re0);
	        }
	        return re;
	    }
		public static List<List<Integer>> helper(List<Integer> l, List<List<Integer>> r, int[] nums, int level) {
			if(nums.length == level) return r; 
			for(int j = level; j < nums.length; j++) {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.addAll(l);
				l1.add(nums[j]);
				if(!r.contains(l1)) r.add(l1);
				r = helper(l1, r, nums, j + 1);
			}
			return r;
		}
		/*
		 * 简化：
		 */
		
		public List<List<Integer>> subsetsWithDup(int[] nums) {
			Arrays.sort(nums);
			List<List<Integer>> res = new ArrayList<List<Integer>>();
		    List<Integer> each = new ArrayList<Integer>();
		    helper(res, each, 0, nums);
		    return res;
	    }
		public void helper(List<List<Integer>> res, List<Integer> each, int pos, int[] n) {
		    if (pos <= n.length) {
		        res.add(each);
		    }
		    int i = pos;
		    while (i < n.length) {
		        each.add(n[i]);
		        helper(res, new ArrayList<Integer>(each), i + 1, n);
		        each.remove(each.size() - 1);
		        i++;
		        while (i < n.length && n[i] == n[i - 1]) {i++;}
		    }
		    return;
		}

}
