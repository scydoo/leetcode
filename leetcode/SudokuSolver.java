package lee;
/*
 * 填满sudoku（hard）
 * 思路：若当前空可填，则填且继续填下一个。若不可，重置当前点，继续遍历char。完全遍历结束找不到，返回false
 */
public class SudokuSolver {

	 public void solveSudoku(char[][] board) {
	        if(board == null || board.length == 0)
	            return;
	        solve(board);
	    }
		public boolean solve(char[][] board) {
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					if(board[i][j] == '.') {
						for(char c = '1'; c <= '9'; c++) {
							if(put(board, i ,j, c))  {
								board[i][j] = c;
								if(solve(board))
	                                return true; 
	                            else
	                                board[i][j] = '.';
							}
						}
						return false;
					}
				}
			}
			return true;
	    }
		public boolean put(char[][] board, int x, int y, char c) {
			for(int i = 0; i < 9; i++) {
				if(board[x][i] == c) return false;
				if(board[i][y] == c) return false;
				if(board[3 * (x / 3) + i / 3][3 * (y / 3) + i % 3] == c) return false;
	 		}
			return true;
		}

}
