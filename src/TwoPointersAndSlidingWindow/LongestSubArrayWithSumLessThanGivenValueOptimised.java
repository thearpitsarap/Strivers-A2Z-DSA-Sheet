package TwoPointersAndSlidingWindow;

public class LongestSubArrayWithSumLessThanGivenValueOptimised {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 7, 10 };
        int k = 14;
        int l = 0;
        int r = 0;
        int sum = 0;
        int len = 0;

        while (r < arr.length && l < arr.length) {
            sum += arr[r];
            if (sum <= k) {
                len = Math.max(len, r - l + 1);
                r++;
            } else {
                sum -= arr[l];
                l++;
            }
        }
        System.out.println(len);
    }
}