package Basics.Patterns;

public class  AlphaRamp {
    public static void alphaRamp(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char) ('A' + i-1)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        alphaRamp(3);
    }
}
