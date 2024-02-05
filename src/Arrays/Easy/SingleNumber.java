package Arrays.Easy;

import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {

        if(nums.length<2){
            return nums[0];
        }
        Arrays.sort(nums);
        int t = 0;
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                t=nums[i];
                break;
            }
        }

        boolean flag2 = true;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[nums.length-1]){
                flag2=false;
            }
        }

        if(flag2==true){
            t=nums[nums.length-1];
        }
        return t;
    }

    public static void main(String[] args) {
        int[] nums = {-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,-336,513,-560,-481,-174,101,-997,40,-527,-784,-283,354};
        System.out.println(singleNumber(nums));
    }
}
