class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //solutions must be under value of target
        //1,2,2,4,5.  

        int l = 0; 
        int r = numbers.length - 1;

        while(numbers[l] + numbers[r] != target) {
            if(numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }
        }

        return new int[]{l+1, r+1};
    }
}
