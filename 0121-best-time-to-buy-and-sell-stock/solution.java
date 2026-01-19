class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int mini = prices[0];
        for(int i=1; i < prices.length; i++){
            int profit = prices[i]-mini;
            if(profit > ans){
                ans = profit;
            }
            mini = Math.min(prices[i], mini);
        }
        return ans;
        
    }
}
