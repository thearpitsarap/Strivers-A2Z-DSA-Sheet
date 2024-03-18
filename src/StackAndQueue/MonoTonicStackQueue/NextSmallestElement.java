package StackAndQueue.MonoTonicStackQueue;
import java.util.Stack;

public class NextSmallestElement {
    public static int[] prevSmaller(int[] A) {
        int[] ans = new int[A.length];
        if(A.length==1){
            ans[0]=-1;
            return ans;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<A.length;i++){
            while(!st.isEmpty() && st.peek()>=A[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i]=st.peek();
            }
            else{
                ans[i]=-1;
            }
            st.push(A[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int[] ans = prevSmaller(nums);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}