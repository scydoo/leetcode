package lee;
/*
 * int[] digits�����ʾһ���Ǹ�����ÿһλ�ô洢������һλ����������һ����������
 * �����ǽ�λ��������ⷨͦ���������λ������λ��0����һλ��1ֱ�ӷ��أ��������λ��ֱ�����������λ��1��
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
