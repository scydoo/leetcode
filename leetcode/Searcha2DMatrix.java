package lee;
/*
 * ��ά�������ε��������ڣ���ĩβ����һ�п�ͷ������ѯĳ��
 * ˼·���ҵ��뷨�Ƕ��ַ��ҵ��У��ٶ����������������ţ���Ȼ�������� ����ά���鿴��һά�Ϳ�����
 */
public class Searcha2DMatrix {

	public boolean searchMatrix2(int[][] matrix, int target) {
		if (matrix.length < 1 || matrix[0].length < 1) {
			return false;
		}
		int n = matrix.length;
		int m = matrix[0].length;
		int l = 0, h = m * n - 1;
		while (l <= h) {
			int mid = (l + h) / 2;
			if (matrix[mid / m][mid % m] < target) {
				l = mid + 1;
			} else if (matrix[mid / m][mid % m] > target){
				h = mid - 1;
			} else {
				return true;
			}
		}
		return false;
	}

}
