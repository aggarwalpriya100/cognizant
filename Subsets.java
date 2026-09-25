/* 
Given : nums=[1, 2, 3]

Return all possible subsets
[]
[1]
[2]
[3]
[1,2]
[1,3]
[2,3]
[1,2,3]
*/ 

import java.util.*;
class Solution {
	List<List<Integer>> result = new ArrayList<>();
	public List<List<Integer>> subsets(int[]nums){
		backtrack(nums , 0 , new ArrayList<>());
		return result ;
	}
	private void backtrack(int[]nums , int index , List<Integer>current){
		// Add current subsets
		result.add(new ArrayList<>(current));
		for(int i = index ; i < nums.length ; i++){
			// choose 
			current.add(nums[i]);
			backtrack(nums , i+1 , current);
			current.remove(current.size()-1);
		}
	}
}