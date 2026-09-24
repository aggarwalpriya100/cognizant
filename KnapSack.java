// 0/1 Knapsack problems 

/* We Create 
	Choice 1 :-> 
	dp[i-1][w]
	Choice 2 :->
	If the item fits :
		value[i-1] + dp[i-1][w-weight[i-1]]
		
	Then choose the maximum:
		Math.max(take , notTake);
*/ 

class Solution{
	public int knapSack(int[] weights, int[]values , int capacity){
		int[][] dp = new int [n+1][capacity+1];
		for(int i = 1 ; i<=n ; i++){
		for(int w = 1 ; w<=capacity ; w++){
		
		//Don't take the item 
		
		dp[i][w] = dp[i-1][w];
		
		//Take the item if it fits 
		
		if(weights[i-1] <= w){
			dp[i][w] = Math.max(dp[i][w] , values[i-1]+dp[i-1][w-weights[i-1]]);
		}
		}
		}
		
		return dp[n][capacity];
	}
}
	