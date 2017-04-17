package lee;
/*
 * in place将每个0元素的对应行和列置0
 * 思路：o(m + n)的方法很容易想到。
 * o(1):将matrix[i][j]映射到[0][j]和[i][0]两点上，遍历第二次更新matrix， 另外用fr和fc表示matrix在第一行和第一列是否有0元素。
 */
public class SetMatrixZeros {

	public void setZeroes(int[][] matrix) {
	    boolean fr = false,fc = false;
	    for(int i = 0; i < matrix.length; i++) {
	        for(int j = 0; j < matrix[0].length; j++) {
	            if(matrix[i][j] == 0) {
	                if(i == 0) fr = true;
	                if(j == 0) fc = true;
	                matrix[0][j] = 0;
	                matrix[i][0] = 0;
	            }
	        }
	    }
	    for(int i = 1; i < matrix.length; i++) {
	        for(int j = 1; j < matrix[0].length; j++) {
	            if(matrix[i][0] == 0 || matrix[0][j] == 0) {
	                matrix[i][j] = 0;
	            }
	        }
	    }
	    if(fr) {
	        for(int j = 0; j < matrix[0].length; j++) {
	            matrix[0][j] = 0;
	        }
	    }
	    if(fc) {
	        for(int i = 0; i < matrix.length; i++) {
	            matrix[i][0] = 0;
	        }
	    }
	}

}
