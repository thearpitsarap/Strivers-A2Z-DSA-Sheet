package TwoPointersAndSlidingWindow;

public class SubArrayWithMaxSum {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,3,4,5,-1};
        int k = 4;
        int l = 0;
        int r = k-1;
        int sum = 0;
        int t = 0;
        
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        while(r<arr.length-1){
            sum-=arr[l];
            r++;
            l++;
            sum+=arr[r];
            t = Math.max(t,sum);
        }
        System.out.println(t);
    }
}