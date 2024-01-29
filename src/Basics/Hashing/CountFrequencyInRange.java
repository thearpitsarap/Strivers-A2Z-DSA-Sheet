package Basics.Hashing;

public class CountFrequencyInRange {
    public static int[] countFrequency(int n, int x, int []nums){
        int[] hash = new int[x+1];
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            hash[nums[i]]+=1;    
        }
        for(int i=0;i<Math.min(x,n);i++){
            arr[i]=hash[i+1];
            // System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 9, 2, 7};
        System.out.println(countFrequency(6, 9, arr));
    }
}
