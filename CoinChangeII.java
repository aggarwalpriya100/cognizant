// Coin Change II 

class Solution {
	public int change(int amount , int[]coins){
		int[] dp = new int[amount+1];
		
		// one way to make amount 
		// choose nothing 
		dp[0] = 1 ;
		
		for(int coin : coins){
			for(int i = coin ; i<= amount ; i++){
				dp[i] += dp[i-coins]; 
			} 
		}
		return dp[amount];
	}
}