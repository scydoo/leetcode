package lee;
/*
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.Each element in the array represents your maximum jump length at that position.  
 * Determine if you are able to reach the last index.
 * array,greedy
 */
public class JumpGame {

	public boolean canJump(int[] nums) {
		int n = nums.length;
		boolean[] d = new boolean[n];
		d[0] = true;
		for(int i = 1; i < n; i++) {
			for(int j = i - 1; j >= 0; j--) {
				if(d[j] == true && nums[j] >= i - j) {
					d[i] = true;
					break;
				}
			}
		}
		return d[n - 1];
	}
	
	public boolean canJump2(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > max) {
				return false;
			}
			max = Math.max(max, nums[j] + i);
		}
		return true;
	}

}
