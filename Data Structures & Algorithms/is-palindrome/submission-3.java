class Solution {
    public boolean isPalindrome(String s) {
        //two pointers, start - end, compare chars if alphanumeric
        //and slide front-back until indexes are equal or front less than back
        String sLower = s.toLowerCase();
        int i = 0; 
        int j = s.length() - 1;

        while(i<j) {
            Character c = sLower.charAt(i);
            Character d = sLower.charAt(j);
            if(!Character.isLetterOrDigit(c)) {
                i++;
                continue;
            }
             if(!Character.isLetterOrDigit(d)) {
                j--;
                continue;
            }
            if(!c.equals(d)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
