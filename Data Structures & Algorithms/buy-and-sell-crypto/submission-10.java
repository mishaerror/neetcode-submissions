class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = 101;
        //on pass solution.

        for(int price: prices) {
            //we go from left and track minimum price
            //every time we find price that would make profit larger, we update profit
            //if there is no such pair, we return default (0)
            if(price < minPrice) {
                minPrice = price;
            }

            if(price - minPrice > profit) {
                profit = price - minPrice;
            }
        }

        return profit;
    }
}
