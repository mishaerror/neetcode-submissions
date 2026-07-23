class Solution {
    public int maxProfit(int[] prices) {
        // 10, 1, 5, 6, 3, 8 --> (1, 8) >> 7
        // 1, 2, 3, 4, 5, 6 --> (0, 5) >> 5
        // 1, 3, 4, 1, 1, 1 --> (0, 2) >> 2
        // 5, 1, 1, 1, 6, 1 -- > ()
        //brute solution - differences of each to all subsequent -
        //price[0] == 100 -> no profit
        //price[0] == 0 --> profit = max(prices)
        //profit = prices[current] - max(sum(rest))

        int left = 0;
        int right = 1;
        int max = 0;

        while(left < prices.length) {
            right = left+1;
            while(right < prices.length) {
                if(prices[right]<prices[left]) {
                    right++;
                    continue;
                }
                int currentMax = prices[right]-prices[left];
                if(currentMax>max) {
                    max = currentMax;
                }
                right++;
            }
            left++;
        }
        return max;
    }
}
