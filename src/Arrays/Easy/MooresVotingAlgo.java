package Arrays.Easy;

public class MooresVotingAlgo {
    public static int majorityElement(int[] nums) {
        int c = 0;
        int c2 = 0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                c=1;
                c2=nums[i];
            }
            else if(nums[i]==c2){
                c++;
            }
            else{
                c--;
            }
        }
        return c2;
    }

    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
