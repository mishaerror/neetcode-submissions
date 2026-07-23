class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        char[] arr = s.toCharArray();
        int maxLength = 0;
        //abcbadb
        Set<Character> buffer = new HashSet<>();
        int currLength = 0;
        int l = 0;
        while(l<s.length()) {
            if(!buffer.contains(arr[l])) {
                buffer.add(arr[l]);
                currLength++;
                if(currLength>maxLength) {
                    maxLength = currLength;
                }
                l++;
            } else {
                char charToRemove = arr[l];
                //remove all chars from the buffer
                buffer.clear();
                currLength = 0;
                
                while(l>0 && arr[l-1] != charToRemove) {
                    l--;
                }
                
            }
        }
        

        return maxLength;
    }
}
