package lee;
/*
 * 和Spiral Matrix反过来，返回n对应的matrix
 */
public class SpiralMatrixII {

	public int[][] generateMatrix(int n) {
        int number = 1;
        int[][] re = new int[n][n];
        int rowBegin = 0, rowEnd = n - 1, colBegin = 0, colEnd = n - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
        	for (int j = colBegin; j <= colEnd; j++) {
        		re[rowBegin][j] = number++;
        	}
        	rowBegin++;
        	for (int j = rowBegin; j <= rowEnd; j++) {
        		re[j][colEnd] = number++;
        	}
        	colEnd--;
        	for (int j = colEnd; j >= colBegin; j--) {
        		re[rowEnd][j] = number++;
        	}
        	rowEnd--;
        	for (int j = rowEnd; j >= rowBegin; j--) {
        		re[j][colBegin] = number++;
        	}
        	colBegin++;
        }
        return re;
    }

}
