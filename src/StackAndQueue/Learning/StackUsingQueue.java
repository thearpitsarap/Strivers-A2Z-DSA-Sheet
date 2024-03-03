package StackAndQueue.Learning;

import java.util.*;

public class StackUsingQueue {
    Queue<Integer> q = new LinkedList<Integer>();

    public void push(int x){
        q.add(x);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
    }

    public int top(){
        return q.peek();
    }

    public int pop(){
        return q.remove();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue st = new StackUsingQueue();
        st.push(1);
        st.push(3);
        System.out.println(st.top());
        st.pop();
        System.out.println(st.isEmpty());
    }
}