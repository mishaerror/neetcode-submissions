class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //1,4,3,2 total 10.  h=9 
        //25,10,23,4 total 62 h=4 

        // k between 1 and max(piles)

        int max = max(piles);

        for(int k = 1; k <= max; k++) {
            long passes = numberOfPasses(piles, k);
            if(passes <= h) {
                return k;
            }
        }
        
        return max;
    }

    private long numberOfPasses(int[] piles, int k) {
        long count = 0;
        for (int pile : piles) {
            count += pile / k;
            if (pile % k > 0) {
                count++;
            }
        }

        return count;
    }

    private int max(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]> max) {
                max = arr[i];
            }
        }

        return max;
    }
}
