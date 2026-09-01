class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> cset = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            Integer num = nums[i];
            if(cset.contains(num)) {
                return true;
            }

            cset.add(num);
        }
        return false;
    }
}