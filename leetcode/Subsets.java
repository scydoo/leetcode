package lee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a set of distinct integers, nums, return all possible subsets.If nums = [1,2,3], a solution is:[[3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], []]
 * ˼·��
 * 1. �ݹ�
 * 2. ����bit,numbers are represented as 0000 0001 0010 0011 0100 ÿ��������������Ӧ������ÿһ��λ�ã����Ƽ�λΪ1���ͽ�����ڼ�������subset������ÿһ��subset��Ӧһ����
 */
public class Subsets {

	public List<List<Integer>> subsets(int[] nums) {
		Arrays.sort(nums);
        List<List<Integer>> re = new ArrayList<List<Integer>>();
		re.add(new ArrayList<Integer>());
        if(nums.length < 1) return re;
        for(int i = 0; i < nums.length; i++) {
        	List<Integer> list = new ArrayList<Integer>();
        	list.add(nums[i]);
        	re.add(list);
        	helper(list,re, nums, i + 1);
        }
        return re;
    }
	public static void helper(List<Integer> l, List<List<Integer>> r, int[] nums, int level) {
		if(nums.length == level) return; 
		for(int j = level; j < nums.length; j++) {
			List<Integer> l1 = new ArrayList<Integer>(l);
			l1.add(nums[j]);
			r.add(l1);
			helper(l1, r, nums, j + 1);
		}
	}
	
	public List<List<Integer>> subsets(int[] nums) {
        int n = 1 << nums.length;
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            List<Integer> subset = new ArrayList<Integer>(); // ÿ��i��Ӧһ��λ�ã���bit�ҳ���Щλ�ü���
            for (int bit = 0; bit < nums.length; bit++) {
                if (((i >> bit) & 1) == 1) { // �����ƶ���λ&1Ϊ1
                	System.out.print("i=" +  i +" bit="+bit +" " +((i >> bit) )+ " and ");
                	subset.add(nums[bit]);
                }
            }
            answer.add(subset);
            System.out.println(" subset=" + subset );
        }
        return answer;
    }

}
