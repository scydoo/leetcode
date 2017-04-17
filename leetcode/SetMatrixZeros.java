package lee;
/*
 * in place��ÿ��0Ԫ�صĶ�Ӧ�к�����0
 * ˼·��o(m + n)�ķ����������뵽��
 * o(1):��matrix[i][j]ӳ�䵽[0][j]��[i][0]�����ϣ������ڶ��θ���matrix�� ������fr��fc��ʾmatrix�ڵ�һ�к͵�һ���Ƿ���0Ԫ�ء�
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
