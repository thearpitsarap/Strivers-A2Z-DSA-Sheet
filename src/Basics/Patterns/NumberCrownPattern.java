package Basics.Patterns;

public class NumberCrownPattern {
    public static void numberCrown(int n) {
        for(int i=n;i>=0;i--){
            if(i==n){
                continue;
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=2*i;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        numberCrown(3);
    }
}
