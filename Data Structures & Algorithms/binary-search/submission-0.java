class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int mid;
        int right = nums.length - 1;
        //1, 3, 4, 5, 8, 9
        int resultIndex = -1;

        while(left<=right) {
            mid = (left + right)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else if(nums[mid] > target) {
                right = mid -1;
            }
        }

        return resultIndex;

    }
}
