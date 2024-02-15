package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_Striver {
    public static List<Integer> spiralOrder(int[][] nums) {
        ArrayList<Integer> li = new ArrayList<Integer>();

        int n = nums.length;
        int m = nums[0].length;
        int right = m-1;
        int left = 0;
        int top = 0;
        int bottom = n-1;

        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                li.add(nums[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                li.add(nums[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    li.add(nums[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    li.add(nums[i][left]);
                }
                left++;
            }                         
        }
        return li;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(nums));
    }
}
