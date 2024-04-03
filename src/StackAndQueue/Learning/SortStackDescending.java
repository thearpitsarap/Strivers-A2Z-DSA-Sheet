package StackAndQueue.Learning;
import java.util.*;

public class SortStackDescending {
    public static Stack<Integer> sortStack(Stack<Integer> st,int v) {
        if(st.isEmpty()){
            st.add(v);
        }
        else{
            int t = st.pop();
            sortStack(st,v);
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
        Stack<Integer> ss = sortStack(st,5);
        while(!ss.isEmpty()){
            System.out.println(ss.pop());
        }
    }
}