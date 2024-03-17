package StackAndQueue.MonoTonicStackQueue;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static int[] prevS(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? i+1 : (i - stack.peek() - 1)+1;
            stack.push(i);
        }
        return result;
    }

    public static int[] nextS(int[] arr){
        int[] ns = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
                while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    ns[i] = st.peek() - i - 1;
                }
                else{
                    ns[i] =  arr.length - 1 - i;
                }
                st.push(i);
        }
        return ns;
    }

    public static int largestRectangleArea(int[] h) {
        int temp = Integer.MIN_VALUE;
        if(h.length<=1){
            return h[0];
        }
        int[] ns = nextS(h);
        int[] ps = prevS(h);

        for(int i=0;i<ps.length;i++){
            int one = ns[i]+ps[i];
            int two = one * h[i];
            if(two>temp){
                temp=two;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {11,81,94,43,3};
        int ans = largestRectangleArea(nums);
        System.out.println(ans);
    }
}