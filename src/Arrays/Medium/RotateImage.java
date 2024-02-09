package Arrays.Medium;

public class RotateImage {
    public static void rotate(int[][] nums) {

        int n = nums[0].length;

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int t = nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=t;
            }
            
            for(int j=0;j<n/2;j++){
                int t = nums[i][j];
                nums[i][j]=nums[i][n-j-1];
                nums[i][n-j-1]=t;
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}