package StackAndQueue.MonoTonicStackQueue;

public class GreaterElementsToTheRight {
    public static int[] countGreater(int []arr, int []q) {
        int[] ans = new int[q.length];
        for(int i = 0;i<q.length;i++){
            int s = 0;
            for(int j=q[i]+1;j<arr.length;j++){
                if(arr[j]>arr[q[i]]){
                    s+=1;
                }
            }
            ans[i]=s;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 10, 4};
        int[] q = {0, 1};
        int[] ans = countGreater(nums,q);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}