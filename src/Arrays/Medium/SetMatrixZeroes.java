package Arrays.Medium;

import java.util.ArrayList;
import java.util.HashMap;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] nums) {
        HashMap<Integer, Integer> li = new HashMap<>();
        ArrayList<Integer> li1 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == 0) {
                    li.put(i, j);
                    li1.add(j);
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            if(li.containsKey(i)){
                for(int j=0;j<nums[i].length;j++){
                    nums[i][j]=0;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for(int j=0;j<nums[i].length;j++){
                if(li1.contains(j)){
                    nums[i][j]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
        setZeroes(nums);
    }
}
