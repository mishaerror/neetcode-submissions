class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // -5, 1, 3, 4.  -1
        int l = 0;
        int r = numbers.length - 1; //start with the sum of end numbers. 
        //larger than target means we need to decrease - move r, less means we need to increase - move l
        while (l < r) {
            if(numbers[l] + numbers[r] < target) {
                l++;
            } else if(numbers[l] + numbers[r] > target) {
                r--;
            } else {
                return new int[]{l+1, r+1};
            }
        }

        return new int[]{};
    }
}
