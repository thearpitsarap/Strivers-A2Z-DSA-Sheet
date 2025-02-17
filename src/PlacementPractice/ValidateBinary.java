package PlacementPractice;

public class ValidateBinary {
    public static void main(String[] args) {
        int n = 1011701;
        while(n>0){
            int t = n%10;
            if(t<0 || t>1){
                System.out.println("False");
                return;
            }
            n = n/10;
        }
        System.out.println("True");
    }
}