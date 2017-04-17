package lee;

import java.util.HashSet;
import java.util.Set;

/*
 * (partially filled)
 * 最优思路：每一个board[i][j]都要加入三次set
 */
public class ValidSudoku {

	  public boolean isValidSudoku(char[][] board) {
			Set<String> set = new HashSet<String>();
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) { 
					if(board[i][j] != '.') {
						if(!set.add(board[i][j] + " in row" + i) ||
								!set.add(board[i][j] + " in column" + j) ||
								!set.add(board[i][j] + " in block" + i/3 + " " + j/3))
							return false;
					}
				}
			}
			return true;
	}
}
