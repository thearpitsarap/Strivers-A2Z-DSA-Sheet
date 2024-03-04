package StackAndQueue.InPrePostFix;

import java.util.Stack;

public class PostToInFix {
    public static String postToInfix(String exp) {
        Stack<String> st = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);
            String c1 = Character.toString(exp.charAt(i));
            if(Character.isLetterOrDigit(c)){
                st.push(c1);
            }
            else{
                String temp = "";
                String c2 = st.peek();
                st.pop();
                String c3 = st.peek();
                st.pop();
                temp += "("+c3+exp.charAt(i)+c2+")";
                st.push(temp);
            }
        }
        return st.peek();
    }  
    public static void main(String[] args) {
        System.out.println(postToInfix("ab+c+"));
    }  
}