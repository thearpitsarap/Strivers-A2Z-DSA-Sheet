package Patterns;

public class starPyramid {
    
    public static void nStarTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        nStarTriangle(7);
    }
}
