package StackAndQueue.MonoTonicStackQueue;

import java.util.Stack;

public class RemoveKDigits {
    public static String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();
        String s = "";
        if(k==num.length()){
            return "0";
        }
        int j = 0;
        for(int i=0;i<num.length();i++){
            int n = num.charAt(i)-'0';
            while(!st.isEmpty() && st.peek()>n && j<k){
                st.pop();
                j++;
            }
            st.push(n);
        }
        if(j==0 || j<k){
            for(int o=j;o<k;o++){
                st.pop();
            }
        }

        int u = 0;
        for(Integer s1 : st){
            if(u==0 && s1==0){
                continue;
            }
            s+=s1;
            u++;
        }
        if(s.equals("")){
            s="0";
        }
        return s;
    }

    public static void main(String[] args) {
        String nums = "1432219";
        String ans = removeKdigits(nums,3);
        System.out.println(ans);
    }
}