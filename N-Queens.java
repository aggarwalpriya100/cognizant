/*
	The n-queens puzzle is the problem of placing n queens on an n x n 
	chessboard such that no two queens attack each other.

	Given an integer n, return all distinct solutions to the n-queens puzzle. 
	You may return the answer in any order.

	Each solution contains a distinct board configuration of the n-queens' 
	placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.
*/ 

/*
	Input: n = 4
	Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
	Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
	Example 2:

	Input: n = 1
	Output: [["Q"]]
	
*/

import java.util.*;
class Solution{
	List<List<String>>result = new ArrayList<>();
	public List<List<String>>solveNQueens(int n){
		char[][]board = new char[n][n];
		
		for(int i=0 ; i<n ; i++){
			Arrays.fill(board[i] , '.');
		}
		HashSet<Integer>cols = new HashSet<>();
		HashSet<Integer>diag1 = new HashSet<>();
		HashSet<Integer>diag2 = new HashSet<>();
		backtrack(0 , n , board, cols , diag1 , diag2);
		return result;
	}
	private void backtrack(
		int row , 
		int n , 
		char[][]board,
		HashSet<Integer>cols , 
		HashSet<Integer>diag1, 
		HashSet<Integer>diag2){
			
			// All Queens Placed 
			
			if(row == n){
				List<String>solution = new ArrayList<>();
				for(int i = 0 ; i < n ; i++){
					solution.add(new String(board[i]));
				}
				result.add(solution);
				return ;
			}
			
			// Try Every Column 
			for(int col = 0 ; col < n ; col++){
				// Check if position is safe 
				if(cols.contains(col) || diag1.contains(row-col) || diag2.contains(row+col)){
					continue;
				}
				
				//Place Queen 
				board[row][col] = 'Q';
				cols.add(col);
				diag1.add(row-col);
				diag2.add(row+col);
				
				// Move to next row 
				
				backtrack(row+1 , n ,board ,cols, diag1 , diag2);
				
				// Backtrack
				
				board[row][col] = '.';
				cols.remove(col);
				diag1.remove(row - col);
				diag2.remove(row + col);
			}
		}
	
}