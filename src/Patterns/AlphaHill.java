package Patterns;

public class AlphaHill {
    public static void alphaHill(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            int t = 0;
            boolean y = false;
            for(int j=0;j<2*i+1;j++){
                if(t>i && y==true){
                    t=0;
                    y=true;
                }
                System.out.print((char) ('A' + t)+"");
                t++;
                if(t>i){
                    y=true;
                }
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        alphaHill(3);
    }
}
