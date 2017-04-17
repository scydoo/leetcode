package lee;

import java.util.ArrayList;
import java.util.List;
/*
 * The set [1,2,3,…,n] contains a total of n! unique permutations.求第k个permutation sequence
 * 思路：count[n]表示n个数排列的总数。除第一位，从第二位开始共count[n - 1]种排列；因此第一个index算当前k是第几个count[n - 1]
 * 从第一位开始依次决定当前位的数，以n=3,k=3为例，index为 2/count[2]=1，表示第3个排列的第一个数字为index + 1
 */
public class PermutationSequence {
	
	public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        int[] count = new int[n + 1];
        count[0] = 1;
        for (int i = 1; i <= n; i++) {
        	count[i] = count[i - 1] * i;
        	list.add(i);
        }
        String res = "";
        k--; // bug point!
        for (int i = 1; i <= n; i++) {
        	int index = k / count[n - i];
        	res += String.valueOf(list.get(index + 1));
        	list.remove(index + 1);
        	k -= count[n - i] * index;
        }
        return res;
}

}
