package Basics.BasicMaths;

public class GCDorHCF {
    public static int calcGCD(int n, int m){
        int t=n;
        if(n>m){
            t=m;
        }
        int h = 0;
        for(int i=1;i<=t;i++){
            if(m%i==0 && n%i==0){
                h = i;
            }
        }
        return h;
    }
    public static void main(String[] args) {
        System.out.println(calcGCD(28, 7));
    }
}
