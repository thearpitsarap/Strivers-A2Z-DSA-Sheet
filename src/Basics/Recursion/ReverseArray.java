package Basics.Recursion;

public class ReverseArray {
    public static int[] reverseArray(int n, int []nums) {
        int[] arr = new int[n];
        int i = 0;
        rev(arr,n,nums,i);
        return arr;
    }
    static void rev(int[] arr,int n,int[] nums,int i){
        if(n==0){
            return;
        }
        arr[i]=nums[n-1];
        i+=1;
        n-=1;
        rev(arr,n,nums,i);
    }

    public static void main(String[] args) {
        int[] arr = {7,5,6,9,4,1};
        System.out.println(reverseArray(6,arr));
    }
}
