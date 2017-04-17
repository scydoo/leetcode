package lee;

import java.util.Arrays;

/*
 * ˼·����������������һ��i��i-1���������һ��������������
 * ����i - 1���Ҳཱུ�����е���С�������������У��޷ǣ������󽵣��Ƚ������������������֡��������ֵ������������������Ϊ����
 * ����12543������2��3��Ȼ����������542����13245
 */
public class NextPermutation {

	public void nextPermutation(int[] nums) {
		int i = nums.length - 1; 
        for (; i > 0; i--) {
        	if (nums[i] > nums[i - 1])
        		break;
        }
        if(i == 0) { // ����ĺ�һ����˳��
        	Arrays.sort(nums);
        	return;
        }
        int j = i;
        int num = i;
        for (; j < nums.length; j++) { // ���Ҳ���С��
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
