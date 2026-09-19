class Solution{
	public int maxProfit(int [] prices){
		int maxProfit = 0 ; 
		int minPrices = prices[0];
		
		for(int i = 1 ; i<prices.length ; i++){
			int profit = prices[i] - minPrices;
			maxProfit = Math.max(profit , maxProfit);
			minPrices = Math.min(minPrices , prices[i]);
		}
		return maxProfit ;
	}
}