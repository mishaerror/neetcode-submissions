class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length()!=t.length()) {
            return false;
        }

        int l = 0;
        int r = s.length() - 1;

        HashMap<Character, Long> charMapS = new java.util.HashMap<>();
        HashMap<Character, Long> charMapT = new java.util.HashMap<>();


        for(int i = 0; i < s.length(); i++) {
            Character sChar = s.charAt(i);

            if(charMapS.containsKey(sChar)) {
                long count = charMapS.get(sChar);
                charMapS.put(sChar, count + 1);
            } else {
                charMapS.put(sChar, 1L);
            }
        }

        for(int i = 0; i < t.length(); i++) {
            Character tChar = t.charAt(i);

            if(charMapT.containsKey(tChar)) {
                long count = charMapT.get(tChar);
                charMapT.put(tChar, count + 1);
            } else {
                charMapT.put(tChar, 1L);
            }
        }

        Set<Character> sKeys = charMapS.keySet();
        Set<Character> tKeys = charMapT.keySet();
        
        if(sKeys.size() != tKeys.size()) {
            return false;
        }
        if(!sKeys.containsAll(tKeys)) {
            return false;
        }
        for(Character skey: sKeys) {
            if(!charMapS.get(skey).equals(charMapT.get(skey))) { 
                return false;
            }
        }


        return true;
    }
}
