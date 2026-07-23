class Solution {
    public int maxProfit(int[] prices) {
        // 10, 1, 5, 6, 3, 8 --> (1, 8) >> 7
        // 1, 2, 3, 4, 5, 6 --> (0, 5) >> 5
        // 1, 3, 4, 1, 1, 1 --> (0, 2) >> 2
        // 5, 1, 1, 1, 6, 1 -- > (5)
        // 1, 5 --> 4
        //1,2,3 --> 2
        //1, 2, 1, 1, 3 
        //1, 4, 2
        int lpos = 0;
        int rpos = 1;
        int maxDiff = 0;

        if(prices.length ==1) {
            return maxDiff;
        }

        while(rpos< prices.length-1 && prices[rpos] < prices[lpos]) {
            lpos++;
            rpos++;
        }
        int min = prices[lpos];
        int max = prices[rpos];


        while(rpos < prices.length) {
            if(prices[lpos]>prices[rpos]) {
                lpos=rpos;
            } else if(prices[rpos] - prices[lpos] > maxDiff) {
                maxDiff = prices[rpos]-prices[lpos];
            }
            
            rpos++;
        }


        return maxDiff;
    }

    private int bruteForce(int[] prices) {

        int left = 0;
        int right = 1;
        int max = 0;

        while(left < prices.length) {
            right = left + 1;
            while(right < prices.length) {
                if(prices[right] < prices[left]) {
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
