package StackAndQueue.Learning;
import java.util.*;

public class SortStackDescending {
    public static Stack<Integer> sortStack(Stack<Integer> s) {
        Stack<Integer> st = new Stack<>();
        
        while(!s.isEmpty()){
            int t = s.pop();
            while(!st.isEmpty() && st.peek()>t){
                s.add(st.pop());
            }
            st.add(t);
        }
		return st;
	}

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(0);
        st.add(0);
        st.add(2);
        Stack<Integer> ss = sortStack(st);
        while(!ss.isEmpty()){
            System.out.println(ss.pop());
        }
    }
}