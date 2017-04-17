package lee;

public class SearchInsertPosition {
	
	public int searchInsert(int[] nums, int target) {
		if (nums.length == 0) {
			return 0;
		}
		int i = 0;
        for (; i < nums.length && target > nums[i]; i++) {
        		
        }
        return i;
    }

}
