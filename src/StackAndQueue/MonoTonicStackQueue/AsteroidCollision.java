package StackAndQueue.MonoTonicStackQueue;

import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] a) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<a.length;i++){
            int pv = Math.abs(a[i]);
            while(!st.isEmpty() && a[i]<0 && st.peek()>0 && pv>st.peek()){
                if(pv==st.peek()){
                    continue;
                }
                st.pop();
            }

            if((!st.isEmpty() && st.peek()>0 && a[i]>0) || (!st.isEmpty() && st.peek()<0 && a[i]<0)){
                st.push(a[i]);
            }
            else if(!st.isEmpty() && a[i]>0 && st.peek()<0 && pv<=st.peek()){
                continue;
            }
            else if(!st.isEmpty() && a[i]<0 && st.peek()>0 && pv<st.peek()){
                continue;
            }
            else if(!st.isEmpty() && st.peek()==pv){
                st.pop();
                continue;
            }
            else{
                st.push(a[i]);
            }
        }
        int[] ans = new int[st.size()];
        int y=0;
        for(int n:st){
            ans[y]=n;
            y++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {10,2,-5};
        int[] ans = asteroidCollision(nums1);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}