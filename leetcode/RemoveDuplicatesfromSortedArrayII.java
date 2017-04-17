package lee;
/*
 * Follow up for "Remove Duplicates":What if duplicates are allowed at most twice?Given sorted array nums = [1,1,1,2,2,3],Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
 * 思路：直接赋值
 */
public class RemoveDuplicatesfromSortedArrayII {

	public int removeDuplicates(int[] nums) {
	    int id = 0;
	    for (int n : nums)
	        if (id < 2 || n > nums[id - 2])
	            nums[id++] = n;
	    return id;

}
