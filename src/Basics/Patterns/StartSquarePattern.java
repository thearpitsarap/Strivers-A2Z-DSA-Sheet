package Basics.Patterns;

public class StartSquarePattern {
    public static void getStarPattern(int n) {
        for(int i=0;i<n;i++){
            if(i==0){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
            }
            else if(i==n-1){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
            }
            else {
                for(int j=0;j<n;j++){
                    if(j==0){
                        System.out.print("*");
                    }
                    else if(j==n-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        getStarPattern(3);
    }
}
