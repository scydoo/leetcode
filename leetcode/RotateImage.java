package lee;
/*
 * 思路：
 * 先以对角线为轴交换数，然后逆序二维数组中一维数组的顺序
 * bug-free
 */
public class RotateImage {

	public void rotate(int[][] matrix) {
		if (matrix.length < 1) {
			return;
		}
		int n = matrix.length;
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < i; j++) {
        		swap(matrix, i, j, j, i);
        	}
        }
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n / 2; j++) {
        		swap(matrix, i, j, i, n - 1 - j);
        	}
        }
    }
	public static void swap(int[][] a, int i1, int j1, int i2, int j2) {
		a[i1][j1] = a[i1][j1] + a[i2][j2];
		a[i2][j2] = a[i1][j1] - a[i2][j2];
		a[i1][j1] = a[i1][j1] - a[i2][j2];
	}

}
