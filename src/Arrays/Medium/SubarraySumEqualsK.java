package Arrays.Medium;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            int temp = 0;
            for(int j=i;j<nums.length;j++){
                temp+=nums[j];
                if(temp==k){
                    sum+=1;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println((subarraySum(nums, k)));
    }
}
