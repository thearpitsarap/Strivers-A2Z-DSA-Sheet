package Patterns;

public class IncreasingNumberTrianglePattern {
    public static void nNumberTriangle(int n) {
        int t = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(t+" ");
                t++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        nNumberTriangle(3);
    }
}
