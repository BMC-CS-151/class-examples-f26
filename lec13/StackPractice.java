import java.util.Stack;
public class StackPractice {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}') {
                if (stack.peek() != '{') return false;
                stack.pop();
            } else if (c == ']') {
                if (stack.peek() != '[') return false;
                stack.pop();
            } else if (c == ')') {
                if (stack.peek() != '(') return false;
                stack.pop();
            } else {
                continue;
            }
        }
        return stack.isEmpty();
    }
}
