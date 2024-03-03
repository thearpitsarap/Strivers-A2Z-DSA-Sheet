package StackAndQueue.InPrePostFix;
import java.util.*;

public class InfixToPostfix {
    public static String infixToPostfix(String exp) {
        String ans = "";
        Stack<Character> st = new Stack<>();

        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                ans+=exp.charAt(i);
            }
            else{
                if(exp.charAt(i)=='^'){
                    if(st.isEmpty() || st.peek()=='('){
                        st.push(exp.charAt(i));
                    }
                    else{
                        while(!st.isEmpty() && st.peek()=='^'){
                            ans+=st.peek();
                            st.pop();
                        }
                        st.push(exp.charAt(i));
                    }
                }
                else if(exp.charAt(i)=='+'){
                    if(st.isEmpty() || st.peek()=='('){
                        st.push(exp.charAt(i));
                    }
                    else{
                        while(!st.isEmpty() && (st.peek()=='^' || st.peek()=='+' || st.peek()=='-' || st.peek()=='/' || st.peek()=='*')){
                            ans+=st.peek();
                            st.pop();
                        }
                        st.push(exp.charAt(i));
                    }
                }
                else if(exp.charAt(i)=='-'){
                    if(st.isEmpty() || st.peek()=='('){
                        st.push(exp.charAt(i));
                    }
                    else{
                        while(!st.isEmpty() && (st.peek()=='^' || st.peek()=='+' || st.peek()=='-' || st.peek()=='/' || st.peek()=='*')){
                            ans+=st.peek();
                            st.pop();
                        }
                        st.push(exp.charAt(i));
                    }
                }
                else if(exp.charAt(i)=='*'){
                    if(st.isEmpty() || st.peek()=='('){
                        st.push(exp.charAt(i));
                    }
                    else{
                        while(!st.isEmpty() && (st.peek()=='^' || st.peek()=='*' || st.peek()=='/')){
                            ans+=st.peek();
                            st.pop();
                        }
                        st.push(exp.charAt(i));
                    }
                }
                else if(exp.charAt(i)=='/'){
                    if(st.isEmpty() || st.peek()=='('){
                        st.push(exp.charAt(i));
                    }
                    else{
                        while(!st.isEmpty() && (st.peek()=='^' || st.peek()=='*' || st.peek()=='/')){
                            ans+=st.peek();
                            st.pop();
                        }
                        st.push(exp.charAt(i));
                    }
                }
                else if(exp.charAt(i)==')'){
                    while(!st.isEmpty() && st.peek()!='('){
                        ans+=st.peek();
                        st.pop();
                    }
                    st.pop();
                }
                else if(exp.charAt(i)=='('){
                    st.push(exp.charAt(i));
                }
            }
        }
        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b+c+d-e"));
    }
}