package lee;

import java.util.ArrayList;
import java.util.List;

/*
 * Given the following matrix: 

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

You should return [1,2,3,6,9,8,7,4,5]. 
 */
public class SpiralMatrix {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<Integer>();
		if(matrix.length==0) {
			return res;
		}
		
		 int rowBegin = 0;
		 int rowEnd = matrix.length-1;
		 int colBegin = 0;
		 int colEnd = matrix[0].length - 1;
		 while (rowBegin <= rowEnd && colBegin <= colEnd) {
			 for (int j = colBegin; j <= colEnd; j++) { // right
				 res.add(matrix[rowBegin][j]);
			 }
			 rowBegin++;
			 for (int i = rowBegin; i <= rowEnd; i++) { // down
				 res.add(matrix[i][colEnd]);
			 }
			 colEnd--;
			 for (int j = colEnd; j >= colBegin; j--) { // left
				 res.add(matrix[rowEnd][j]);
			 }
			 rowEnd--;
			 for (int i = rowEnd; i >= rowBegin; i--) { // up
				 res.add(matrix[i][colBegin]);
			 }
			 colBegin++;
		 }
		
		return res;
    }

}
