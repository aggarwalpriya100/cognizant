/* 
	Permutations 
	
	[1,2,3]
	Permuations are : 
	[1,2,3]
	[1,3,2]
	[2,1,3]
	[2,3,1]
	[3,1,2]
	[3,2,1]
	
*/
	
import java.util.*;

class Solution {
	List<List<Integer>> result = new ArrayList<>();
	public List<List<Integer>> permute(int[] nums){
	boolean []used = new boolean[nums.length];
	backtrack(nums , new ArrayList<>() , used);
	return result ;
	}
	private void backtrack(int [] nums , List<Integer>current , boolean []used){
		if(current.size() == nums.length){
		result.add(new ArrayList<>(current));
		return ;
		}
		for(int i =0 ; i< nums.length ; i++){
		if(used[i]){
			continue ;
		}
		current.add(nums[i]); // choose
		used[i] = true ;
							// explore 
		backtrack(nums, current , used);
							//undo
		used[i] = false ;
		current.remove(current.size()-1);
	
		}
	}
}
	
					