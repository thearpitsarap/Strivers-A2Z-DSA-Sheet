package Basics.BasicMaths;

public class SumOfAllDivisors {
    public static int sumOfAllDivisors(int n){
        int t = 0;
        for(int i=1;i<=n;i++){
            int t2 = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    t2+=j;
                }
            }
            t+=t2;
        }
        return t;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(10));
    }
}
