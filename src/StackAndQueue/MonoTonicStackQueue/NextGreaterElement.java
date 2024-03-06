package StackAndQueue.MonoTonicStackQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(nums2[i]);
                map.put(nums2[i],-1);
            }
            else{
                while(!st.isEmpty() && st.peek()<nums2[i]){
                    st.pop();
                }
                if(!st.isEmpty()){
                    map.put(nums2[i],st.peek());
                    st.push(nums2[i]);
                }
                else{
                    map.put(nums2[i],-1);
                    st.push(nums2[i]);
                }
            }
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int[] ans = nextGreaterElement(nums1, nums2);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}