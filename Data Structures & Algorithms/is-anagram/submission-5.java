class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }


        HashMap<Character, Integer> charMapS = new HashMap<>();
        HashMap<Character, Integer> charMapT = new HashMap<>();


        for(int i = 0; i < s.length(); i++) {
            Character keys = s.charAt(i);
            
            if(charMapS.containsKey(keys)) {
                Integer num = charMapS.get(keys);
                charMapS.put(keys, num + 1);
            } else {
                charMapS.put(keys, 1);
            }

            Character keyt = t.charAt(i);

            if(charMapT.containsKey(keyt)) {
                Integer num = charMapT.get(keyt);
                charMapT.put(keyt, num + 1);
            } else {
                charMapT.put(keyt, 1);
            }
        }

    
        Character[] keys = charMapS.keySet().toArray(new Character[]{});
        //compare maps
        for(Character sChar: keys) {
            if(!charMapT.containsKey(sChar) || 
            !charMapT.get(sChar).equals(charMapS.get(sChar))) {
                return false;
            }
            charMapT.remove(sChar);
            charMapS.remove(sChar);
        }
        return charMapT.size()==0 && charMapS.size()==0;
    }
}
