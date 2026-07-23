class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.HashSet<Integer> numSet = new java.util.HashSet<Integer>();
        if(nums == null) {
            return false;
        }
        for(int i = 0; i < nums.length; i++) {
            if(numSet.contains(nums[i])) {
                return true;
            }

            numSet.add(nums[i]);
        }

        return false;
    }
}