class Solution {
    public int[] twoSum(int[] nums, int target) {
        //scan from i=0
        //look for num[j] = target - num[i] 
        //and keys are differences for target

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.get(diff) != null) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
