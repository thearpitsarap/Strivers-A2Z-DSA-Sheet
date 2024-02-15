package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_Me {
     public static List<Integer> spiralOrder(int[][] nums) {

        ArrayList<Integer> li = new ArrayList<>();

        if(nums.length<2 || nums[0].length<2){
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums[0].length;j++){
                    li.add(nums[i][j]);
                }
            }

            return li;
        }

        int c1=nums[0].length;
        int c2=1;
        int c3 = 0;
        int c5 = nums[0].length;
        int c6 = nums.length-1;
        int c7 = nums.length-1;
        int c8 = nums.length-2;
        int c9 = 0;
        int s = 0;
        int s1 = 0;

        while(s<nums.length){
            s+=1;
            for(int i=c3;i<c1;i++){
                if(!li.contains(nums[c3][i])){
                    li.add(nums[c3][i]);
                }
            }
            c3+=1; 
            c1-=1;

            for(int i=c2;i<c6;i++){
                if(c5-1<0 || i>2){
                    break;
                }
                else if(!li.contains(nums[i][c5-1])){
                    li.add(nums[i][c5-1]);
                }
            }
            c2+=1;
            c5-=1;

            for(int i=nums[c7].length-1;i>=s1;i--){
                if(!li.contains(nums[c7][i])){
                    li.add(nums[c7][i]);
                }
            }
            c7-=1;
            s1+=1;
            s+=1;

            for(int i=c8;i>c9;i--){
                if(!li.contains(nums[i][c9])){
                    li.add(nums[i][c9]);
                }
            }
            c8-=1;
            c9+=1;
            }

        return li;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(nums));
    }
}
