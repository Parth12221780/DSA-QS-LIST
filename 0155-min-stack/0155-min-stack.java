import java.util.Stack;

class MinStack {
    Stack<Integer> st; // Normal stack
    Stack<Integer> minst; // Stack to store min values

    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
    }

    public void push(int val) {
        st.push(val);

        // Push only if minst is empty or val is <= current min
        if (minst.isEmpty() || val <= minst.peek()) {
            minst.push(val);
        }
    }

    public void pop() {
        if (st.isEmpty())
            return;

        // If popping the min element, pop from minst as well
        if (st.peek().equals(minst.peek())) {
            minst.pop();
        }
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minst.peek(); // Always returns the min value
    }
}
