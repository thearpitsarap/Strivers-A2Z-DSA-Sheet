package Patterns;

public class NumberPattern {
    public static void getNumberPattern(int n) {
        int r = n;
        for(int i=n-1;i>=0;i--){
            int m=n;
            for(int j=1;j<=n-i-1;j++){
                System.out.print(m--);
            }
            for(int j=1;j<2*i+1;j++){
                System.out.print(r);
            }
            for(int j=0;j<=n-i-1;j++){
                System.out.print(m++);
            }
            r--;
            System.out.println();
        }
        
        int y = 2;
        for(int i=2;i<=n;i++){
            int m=n;
            for(int j=0;j<=n-i-1;j++){
                System.out.print(m--);
            }
            for(int j=1;j<2*i-1;j++){
                System.out.print(y);
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print(m++);
            }
            y++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        getNumberPattern(4);
    }
}
