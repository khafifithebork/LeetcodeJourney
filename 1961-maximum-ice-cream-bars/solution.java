class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans=0;
        for(int cost : costs){
            int currCoins=coins-cost;
            if(currCoins >= 0){
                ans++;
                coins -=cost;
            }
            else break;
        }
        return ans;
    }
}
