package Arrays.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class LongestSubarrayWithSumK {
    public static int longestSubarrayWithSumK(int []a, long k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            int sum = 0;
            int count = 0;
            for(int j=i;j<a.length;j++){
                if(sum<=k){
                    sum+=a[j];
                    count++;
                }
                if(sum==k){
                    list.add(count);
                }
            }
        }
        return Collections.max(list);  
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1, 1, 1, 1};
        System.out.println(longestSubarrayWithSumK(nums, 3));
    }
}
