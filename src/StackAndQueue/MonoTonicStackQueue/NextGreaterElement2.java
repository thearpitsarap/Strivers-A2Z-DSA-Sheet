package StackAndQueue.MonoTonicStackQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement2 {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = 0; i < (n << 1); ++i) {
            while (!stk.isEmpty() && nums[stk.peek()] < nums[i % n]) {
                ans[stk.pop()] = nums[i % n];
            }
            stk.push(i % n);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int[] ans = nextGreaterElements(nums);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}