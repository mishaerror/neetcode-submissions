class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //-1,0,1,2,-1,-4 : -4,-1,-1,0,1, 2
        Arrays.sort(nums);

        for(int i = 0; i < nums.length -1; i++) {
            if(nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int j = i + 1;
            int k = nums.length -1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    //skip duplicates
                    j++;
                    k--;
                    while(j<k && nums[j-1] == nums[j]) {
                        j++;
                    }
                    
                } else if(sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return result;
    }
}
