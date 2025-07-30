class Solution {
    public int maxProfit(int[] prices) {
        int i,n=prices.length,buy=prices[0],profit=0;
        for(i=1;i<n;i++){
            if(prices[i]<=buy)
                buy=prices[i];
            else
                profit=Math.max(profit,prices[i]-buy);
        }
        return profit;
    }
}