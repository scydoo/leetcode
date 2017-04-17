package lee;
/*
 * int[] digits数组表示一个非负数，每一位置存储该数的一位。将该数加一，返回数组
 * （就是进位），这个解法挺巧妙（遇到进位，将本位置0，上一位加1直接返回，若到最高位，直接新数组最高位置1）
 */
public class PlusOne {

	public int[] plusOne(int[] digits) {
	    int n = digits.length;
	    for(int i = n - 1; i >= 0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n + 1];
	    newNumber[0] = 1;
	    return newNumber;
	}

}
