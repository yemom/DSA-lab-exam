package finalLabExam.question5;

import java.util.Stack;
public class question5 {


    public static class question05{
        public String reverseString(String s) {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                stack.push(c);
            }
            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }
            return reversed.toString();
        }

    }

}
