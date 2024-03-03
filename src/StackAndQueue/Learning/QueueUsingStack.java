package StackAndQueue.Learning;
import java.util.*;

public class QueueUsingStack {
    Stack<Integer> st1, st2;

    public QueueUsingStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        st1.push(x);
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }
    
    public int pop() {
        return st1.pop();
    }
    
    public int peek() {
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack st =  new QueueUsingStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.pop();
        st.push(5);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
    }
}