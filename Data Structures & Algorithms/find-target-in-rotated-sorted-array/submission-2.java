class Solution {
    public int search(int[] nums, int target) {
        int result = -1;
        //5,6,1,2,3,4
        //4,5,6,7,1,2

        int l = 0;
        int r = nums.length -1;

        while(l<=r) {
            int mid = (l+r)/2;
            if(nums[mid]==target) {
                return mid;
            }
            if(nums[l]==target) {
                return l;
            }
            if(nums[r]==target) {
                return r;
            }

            if(nums[mid]<nums[r]) {//right part is sorted 
                if(target < nums[r] && target > nums[mid]) {//and num is there
                    l = mid+1;
                } else {
                    r = mid -1;
                }
            } else {//left part is sorted
                if(target > nums[l] && target < nums[mid]) {//and num is there
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }

        return result;
    }
}
