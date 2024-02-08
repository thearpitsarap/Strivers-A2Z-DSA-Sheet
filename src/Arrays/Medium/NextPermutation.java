package Arrays.Medium;

public class NextPermutation {
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void nextPermutation(int[] nums) {
        int ind = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            for(int i=0;i<nums.length/2;i++){
                int t = nums[i];
                nums[i]=nums[nums.length-i-1];
                nums[nums.length-i-1]=t;
            }
        } else {
            for (int i = nums.length-1; i >= ind; i--) {
                if (nums[i] > nums[ind]) {
                    int t = nums[i];
                    nums[i] = nums[ind];
                    nums[ind] = t;
                    break;
                }
            }
            reverse(nums, ind + 1, nums.length - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,5,1};
        nextPermutation(nums);
    }
}