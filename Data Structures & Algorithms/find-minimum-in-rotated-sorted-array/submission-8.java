class Solution {
    public int findMin(int[] nums) {
        //minimum will be the first one in the asc order, that is
        // min(nums[i]) nums[i]<nums[i+1] 
        //binary search 
        // 2,3,4,5,6,1
        // 7,0,1,2,5,6
        // 5,6,7,8,3,4
        // 6,1,2,3,4,5
 
        int l = 0;
        int r = nums.length - 1;
        
        int  result = nums[0];

            while(l<=r) {
                if(nums[l]<nums[r]) {
                    result = Math.min(result, nums[l]);
                    break;
                }
                int mid = (l+r)/2;
                if(nums[mid] < result) {
                    result = nums[mid];
                }
                if(nums[mid] >= nums[r]) {
                    l = mid +1;
                } else {
                    r = mid - 1;
                }


            }
        

        return result;
    }
}
