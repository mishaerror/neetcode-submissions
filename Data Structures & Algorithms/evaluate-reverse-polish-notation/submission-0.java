class Solution {
    private static final List<String> OPERANDS = List.of("+", "-", "*", "/");
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        //we maintain a stack, when we get to operand, apply it to top tow elements
        //by popping stack and applying operand, then pushing result to stack
        List<Integer> vals = new ArrayList<>();
        for(int i = 0; i < tokens.length; i++) {
                Integer op1;
                Integer op2;
                switch(tokens[i]) {
                    case "+":
                    op1 = stack.pop();
                    op2 = stack.pop();
                     stack.push(op1 + op2);
                    break;
                    case "-":
                    op1 = stack.pop();
                    op2 = stack.pop();
                     stack.push(op2 - op1);
                    break;
                    case "*":
                    op1 = stack.pop();
                    op2 = stack.pop();
                     stack.push(op1 * op2);
                    break;
                    case "/":
                    op1 = stack.pop();
                    op2 = stack.pop();
                     stack.push(op2 / op1);
                    break;
                    default:
                    stack.push(Integer.valueOf(tokens[i]));
                }
        }

        return stack.pop();
    }
}
