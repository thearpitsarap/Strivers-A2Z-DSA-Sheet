package Arrays.Medium;

public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] nums) {
        int t=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<t){
                t=nums[i];
            }
            if(nums[i]-t > sum){
                sum=nums[i]-t;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,6,5,0,3};
        System.out.println(maxProfit(nums));
    }
}
