class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charBuffer = new HashSet<>();
        int maxlen = 0;
        int lpos = 0;
        
        for(int rpos = 0; rpos < s.length(); rpos++) {
            Character c = s.charAt(rpos);
            while(charBuffer.contains(c)) {
                charBuffer.remove(s.charAt(lpos));
                lpos++;
            }
            charBuffer.add(c);
            maxlen = Math.max(maxlen, rpos - lpos + 1);
        }

        return maxlen;
    }
}
