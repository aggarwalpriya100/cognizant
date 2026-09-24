// Partition Equal Subset Sum

class Solution{
	public boolean canPartition(int []nums){
		int total = 0 ;
		 for(int num : nums){
			 total = total + num ;
		 }
		 
		 if(total%2 != 0){
			 return false ;
		 }
		 int target = total % 2 ;
		 boolean []dp = new boolean[target+1]; 
		 //sum 0 is always possible 
		 dp[0] = true ;
		 for(int num : nums){
			 for(int sum = target ; sum >= num ;sum --){
				 dp[sum] = dp[sum] || dp[sum -num];
			 }
		 }
		 return dp[target];
	}
}