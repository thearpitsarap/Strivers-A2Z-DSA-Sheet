package StackAndQueue;

import java.util.LinkedList;

public class StackUsingLinkedList {
    static class Stack {
        
        LinkedList<Integer> ll;
        
        Stack()
        {
            ll = new LinkedList<>();
        }

        int getSize()
        {
            return ll.size();
        }

        boolean isEmpty()
        {
            return ll.isEmpty();
        }

        void push(int data)
        {
            ll.add(data);
        }

        void pop()
        {
            if(!isEmpty()){
                ll.removeLast();
            }
        }

        int getTop()
        {
            if(!isEmpty()){
                return ll.getLast();
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.pop();
        System.out.println(st.getTop());
    }
}