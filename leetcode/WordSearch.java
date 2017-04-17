package lee;
/*
 * The word can be constructed from letters of horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * Given board =[  ['A','B','C','E'], ['S','F','C','S'], ['A','D','E','E']]word = "ABCCED", -> returns true,word = "SEE", -> returns true,word = "ABCB", -> returns false.
 * 思路：记得将走过的路标记，将char^256即可
 */
public class WordSearch {

	public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
        	for (int j = 0; j < board[0].length; j++) {
        		if (board[i][j] == word.charAt(0)) {
        			if (helper(board, word, i, j)) { 
        				return true;
        			}
        		}
        	}
        }
        return false;
    }
	public static boolean helper(char[][] grid, String word, int x, int y) {
		if (word.length() < 1) {
			return true;
		}
		if (x < 0 || x == grid.length || y < 0 || y == grid[0].length || grid[x][y] != word.charAt(0)) {
			return false;
		}
		grid[x][y] ^= 256;
		boolean exist = helper(grid, word.substring(1), x - 1, y) || helper(grid, word.substring(1), x + 1, y)
				|| helper(grid, word.substring(1), x, y - 1) || helper(grid, word.substring(1), x, y + 1);
		grid[x][y] ^= 256;
		return exist;
	}

}
