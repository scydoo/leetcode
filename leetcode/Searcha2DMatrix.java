package lee;
/*
 * 二维数组依次递增（行内，行末尾和下一行开头），查询某数
 * 思路：我的想法是二分法找到行，再二分找行内数。最优：既然依次增大， 将二维数组看成一维就可以了
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
