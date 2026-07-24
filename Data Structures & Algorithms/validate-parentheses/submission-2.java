class Solution {
    static final List<Character> OPENERS = List.of('(','{','[');
    static final Map<Character, Character> OPENER_FOR = Map.of(')','(','}','{',']','[');

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(OPENERS.contains(c)) {
                stack.push(c);
            } else {
                if(stack.empty() || !stack.peek().equals(OPENER_FOR.get(c))) {
                    return false;
                }
                
                stack.pop();
            }
        }

        return stack.empty();
    }
}
