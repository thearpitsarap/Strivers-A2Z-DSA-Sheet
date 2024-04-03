package Recursion;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> st) {
		if(st.isEmpty()){
			return;
		}
		int t = st.pop();
		reverseStack(st);
		insertAtBottom(st,t);
	}

	public static void insertAtBottom(Stack<Integer> st,int val){
		if(st.isEmpty()){
			st.add(val);
		}
		else{
			int t = st.pop();
			insertAtBottom(st,val);
			st.add(t);
		}
	}

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(0);
        st.add(0);
        st.add(8);
        reverseStack(st);
    }
}