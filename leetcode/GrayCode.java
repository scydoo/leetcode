package lee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * The gray code is a binary numeral system where two successive values differ in only one bit.Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.For example, given n = 2, return [0,1,3,2]
 * 思路1：发现了规律，n=1：0,1，n=2：0,1,3,2，n=3：0,1,3,2,6,7,5,4。第n个是第n-1个以倒序加2的n-1次方
 * 思路2：更简洁，通过异或和右移
 */
public class GrayCode {

	public List<Integer> grayCode(int n) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		if(n == 0) return list;
		int number = (int)Math.pow(2,n);
		int i = 2;
		while(i <= number) {
			for(int j = list.size()- 1; j >= 0; j--) {
				list.add(list.get(j) + i / 2);
			}
			i *= 2;
		}
		return list;
	}

	public List<Integer> grayCode(int n) {
	    List<Integer> result = new LinkedList<>();
	    for (int i = 0; i < 1<<n; i++) result.add(i ^ (i>>1));
	    return result;
	}
}
