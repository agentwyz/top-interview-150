class Solution {
    public int maxProfit(int[] prices) {
        //使用贪心算法
        int res = 0;
        int len = prices.length;
        for ( int i = 0; i+1 < len; i++ )
            //如果第一天买入, 第二天比第一天高, 然后卖出
            if ( prices[i + 1] > prices[i] )
                //1 2 5, 5 - 1 = 4, 4 = 3 + 1 
                res += prices[i + 1 ] - prices[i];
        
        return res;
    }
}


/*
第二种做法就是使用动态规划来做
我们需要表示的状态一共有两个
1. 是否持有股票
2. 第i天
3. 值表示的是最大的值
*/
class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        
        //表示n行, 两列
        int[][] dp = new int[len][2];

        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < len; i++) {
            //表示i天, 没有持有股票， 
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0]-prices[i]);
        }

        return dp[len-1][0];
    }
}
