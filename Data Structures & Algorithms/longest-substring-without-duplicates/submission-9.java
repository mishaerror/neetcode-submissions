class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charBuffer = new HashMap<>();
        int maxlen = 0;
        int lpos = 0;
        
        for(int rpos = 0; rpos < s.length(); rpos++) {
            Character c = s.charAt(rpos);
            if(charBuffer.containsKey(c)) {
                lpos = Math.max(charBuffer.get(c) + 1, lpos);
            }
            charBuffer.put(c, rpos);
            maxlen = Math.max(maxlen, rpos - lpos + 1);
        }

        return maxlen;
    }
}
