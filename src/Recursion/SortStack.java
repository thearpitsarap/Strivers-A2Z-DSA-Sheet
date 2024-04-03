package Recursion;

import java.util.Stack;

public class SortStack {
    public static Stack<Integer> sortStack(Stack<Integer> s) {
        if(s.isEmpty() || s.size()==1){
			return s;
		}
		int t = s.pop();
		sortStack(s);
		addProper(s,t);
		return s;
	}

	public static Stack<Integer> addProper(Stack<Integer> st,int v){
		if(st.isEmpty() || st.peek()<=v){
            st.add(v);
        }
        else{
            int t = st.pop();
            addProper(st,v);
            st.add(t);
        }
		return st;
	}

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(0);
        st.add(0);
        st.add(8);
        Stack<Integer> ss = sortStack(st);
        while(!ss.isEmpty()){
            System.out.println(ss.pop());
        }
    }
}