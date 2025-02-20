package TwoPointersAndSlidingWindow;

public class LongestSubArrayWithSumLessThanGivenValue {
    public static void main(String[] args) {
        int arr[] = {2,5,1,7,10};
        int k = 14;
        
        int maxlen = 0;
        for(int i=0;i<arr.length;i++){
            int sum = Integer.MIN_VALUE;
            for(int j=i;j<arr.length;j++){
                sum+=arr[i];
                if(sum<=k){
                    maxlen = Math.max(maxlen,j-i-1);
                }
            }
        }
        System.out.println(maxlen);
    }
}