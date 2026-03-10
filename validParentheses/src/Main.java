import java.util.Stack;

public class Main {
    static void main(String[] args) {

        String s = ")";

        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);

            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (i == 0 && (bracket == ')' || bracket == ']' || bracket == '}')) {
                isValid = false;
                break;
            }
            else {
                switch (bracket) {
                    case ')':
                        if (stack.isEmpty() || stack.peek() != '(') {
                            isValid = false;
                            break;
                        } else {
                            stack.pop();
                            break;
                        }
                    case ']':
                        if (stack.isEmpty() || stack.peek() != '[') {
                            isValid = false;
                            break;
                        } else {
                            stack.pop();
                            break;
                        }
                    case '}':
                        if (stack.isEmpty() || stack.peek() != '{') {
                            isValid = false;
                            break;
                        } else {
                            stack.pop();
                            break;
                        }
                }
            }
        }
        if (!stack.isEmpty()) {
            isValid = false;
        }
        System.out.println(isValid);
    }
}