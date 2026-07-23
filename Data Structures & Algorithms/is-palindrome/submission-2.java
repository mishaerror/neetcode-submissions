class Solution {
    public boolean isPalindrome(String s) {
        
        String sLowered = s.toLowerCase();
        int length = sLowered.length();

        int l = 0;
        int r = length - 1;
        
        char[] a = sLowered.toCharArray();
        while(l<=r && l<length && r >=0) {
            while(l < length && !isValidChar(a[l])) l++;
            while(r >= 0 && !isValidChar(a[r])) r--;

            if(l>r || l==length || r ==0) {
                return true;
            }

            if(a[l] != a[r]) {
                return false;
            }
            l++;
            r--;
    }

        return true;
    }

    private static boolean isValidChar(char c) {
        return c >= 'a' && c <= 'z'
        || c >= 'A' && c <= 'Z'
        || c>= '0' && c <= '9';
    }
}
