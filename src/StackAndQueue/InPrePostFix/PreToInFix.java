package StackAndQueue.InPrePostFix;
import java.util.*;


public class PreToInFix {

    public static String prefixToInfixConversion(String exp) {
        Stack<String> st = new Stack<>();
        for (int i=exp.length()-1;i>=0;i--){
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
                temp += "(" + c2+exp.charAt(i)+c3+")";
                st.push(temp);
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        System.err.println(prefixToInfixConversion("/-ab+-cde"));
    }
    
}