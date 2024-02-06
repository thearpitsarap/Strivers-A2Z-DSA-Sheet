package Arrays.Medium;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            for (int j = i; j < nums.length; j++) {
                c += nums[j];
                if (c > sum) {
                    sum = c;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
