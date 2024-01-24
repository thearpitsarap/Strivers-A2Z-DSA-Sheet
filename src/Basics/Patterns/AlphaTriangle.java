package Basics.Patterns;

public class AlphaTriangle {
    public static void alphaTriangle(int n) {
        char ch = (char)('A'+n-1);
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                System.out.print((ch)+" ");
                ch--;
            }
            ch = (char)('A'+n-1);
            System.out.println();
        }
    }
    public static void main(String args[]){
        alphaTriangle(3);
    }
}
