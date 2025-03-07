import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
            Stack<Character> st = new Stack<>();  // Declare a stack

                    for (char c : s.toCharArray()) {  // Convert string to char array for iteration
                                if (c == '(' || c == '{' || c == '[') {
                                                st.push(c);  // Push opening brackets
                                                            } else {
                                                                            if (st.isEmpty()) {  // If stack is empty, return false
                                                                                                return false;
                                                                                                                }
                                                                                                                                char top = st.peek();  // Get the top element without popping
                                                                                                                                                if ((c == ')' && top != '(') || 
                                                                                                                                                                    (c == '}' && top != '{') || 
                                                                                                                                                                                        (c == ']' && top != '[')) {
                                                                                                                                                                                                            return false;  // Mismatched brackets
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            st.pop();  // Remove matched bracket
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                        return st.isEmpty();  // Stack should be empty if valid
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            