class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> posMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            Integer num = nums[i];
            Integer key = target - num;
            
            if(posMap.containsKey(key)) {
                return new int[]{posMap.get(key), i};
            }

            posMap.put(num, i);
        }

        return new int[]{};
    }
}
