package StackAndQueue.MonoTonicStackQueue;

import java.util.Stack;

public class SumofSubarrayMinimums {
    public static int[] getNsl(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] nsl = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
                while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    nsl[i]=st.peek();
                }
                else{
                    nsl[i]=-1;
                }
            st.push(i);
        }
        return nsl;
    }

    public static int[] getRsl(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] rsl = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
                while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    rsl[i]=st.peek();
                }
                else{
                    rsl[i]=arr.length;
                }
            st.push(i);
        }
        return rsl;
    }

    public static int sumSubarrayMins(int[] arr) {
        long sum = 0;
        long m = (long) (1e9 + 7);

        int[] nsl = getNsl(arr);
        int[] rsl = getRsl(arr);

        for (int i = 0; i < rsl.length; i++) {
            long ls = i - nsl[i];
            long rs = rsl[i] - i;
            long lsrs = ls * rs;
            long toadd = arr[i] * lsrs;
            sum = (toadd + sum) % m;
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        int[] nums = {11,81,94,43,3};
        int ans = sumSubarrayMins(nums);
        System.out.println(ans);
    }
}