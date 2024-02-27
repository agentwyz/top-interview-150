class Solution {
    public int maxProfit(int[] prices) {
        
        int len = prices.length;
        int cost = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < len; i++) {
            
            cost = Math.min(cost, prices[i]);
            profit = Math.max(profit, prices[i] - cost);
        }

        return profit;
    }
}