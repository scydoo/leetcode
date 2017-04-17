package lee;

import java.util.Arrays;

/*
 * 思路：从右数，遇到第一个i比i-1大的数（第一个从右数的升序）
 * 交换i - 1和右侧降序排列的最小的数（所有排列，无非：先升后降，先降后升，还有升降四种。将最后出现的升序的两个连续数变为降序）
 * 比如12543，交换2和3，然后升序排列542，得13245
 */
public class NextPermutation {

	public void nextPermutation(int[] nums) {
		int i = nums.length - 1; 
        for (; i > 0; i--) {
        	if (nums[i] > nums[i - 1])
        		break;
        }
        if(i == 0) { // 逆序的后一个是顺序
        	Arrays.sort(nums);
        	return;
        }
        int j = i;
        int num = i;
        for (; j < nums.length; j++) { // 找右侧最小数
        	if (nums[j] > nums[i - 1] && nums[j] < nums[num]) 
        		num = j;
        }
        swap(nums, i - 1, num);
        Arrays.sort(nums, i, nums.length);
    }
	public static void swap(int[] a, int i, int j) {
		a[i] = a[i] + a[j];
		a[j] = a[i] - a[j];
		a[i] = a[i] - a[j];
	}
}
