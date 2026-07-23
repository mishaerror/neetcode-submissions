class Solution {
    public boolean isAnagram(String s, String t) {
        // we need to see if all characters are in both strings and the count is the same
        // we use maps for counting
        Map<Character, Integer> sMap = toCountMap(s);
        Map<Character, Integer> tMap = toCountMap(t);

        Set<Map.Entry<Character, Integer>> sEntries = sMap.entrySet();
        Set<Map.Entry<Character, Integer>> tEntries = tMap.entrySet();

        return sEntries.containsAll(tEntries) && tEntries.containsAll(sEntries);
    }

    private Map<Character, Integer> toCountMap(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            Integer count = map.get(c);
            if (count == null) {
                count = 1;
            } else {
                count = count + 1;
            }
            map.put(c, count);
        }

        return map;
    }
}
