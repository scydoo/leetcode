package lee;

import java.util.ArrayList;
import java.util.List;
/*
 * The set [1,2,3,��,n] contains a total of n! unique permutations.���k��permutation sequence
 * ˼·��count[n]��ʾn�������е�����������һλ���ӵڶ�λ��ʼ��count[n - 1]�����У���˵�һ��index�㵱ǰk�ǵڼ���count[n - 1]
 * �ӵ�һλ��ʼ���ξ�����ǰλ��������n=3,k=3Ϊ����indexΪ 2/count[2]=1����ʾ��3�����еĵ�һ������Ϊindex + 1
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
