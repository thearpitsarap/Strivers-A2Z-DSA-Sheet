package PlacementPractice.CommonQuestions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
     public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            int t = target - nums[i];
            if(map.containsKey(t)){
                ans[0] = i;
                ans[1] = map.get(t);
            }
            else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] ans = twoSum(arr,9);
        for(Integer i:ans){
            System.out.println(i);
        }
    }
}