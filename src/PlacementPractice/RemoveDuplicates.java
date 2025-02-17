package PlacementPractice;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int t = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[t]!=nums[i]){
                nums[t+1]=nums[i];
                t+=1;
            }
        }
        return t+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}