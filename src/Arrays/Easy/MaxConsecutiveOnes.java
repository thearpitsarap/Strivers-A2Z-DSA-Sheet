package Arrays.Easy;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1 && nums[i]==1){
                if(c1 >= c2){
                    c1+=1;
                    c2 = c1;
                }
            }
            else if(nums[i]!=0){
                c1+=1;
            }
            else if(nums[i]==0){
                if(c1 > c2){
                    c2 = c1;
                }
                c1=0;
            }
        }
        return c2;
    }

    public static void main(String[] args) {
        int nums[] = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
