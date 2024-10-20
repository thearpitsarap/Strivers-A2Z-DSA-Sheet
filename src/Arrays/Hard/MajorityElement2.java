package Arrays.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> li = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                if(map.get(nums[i])>(nums.length/3) && !li.contains(nums[i])){
                    li.add(nums[i]);
                }
            }
            else{
                map.put(nums[i],1);
                if(map.get(nums[i])>(nums.length/3) && !li.contains(nums[i])){
                    li.add(nums[i]);
                }
            }
        }
        return li;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        List<Integer> li = majorityElement(arr);
        System.err.println(li);
    }
}