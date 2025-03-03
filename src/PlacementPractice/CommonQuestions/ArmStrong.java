package PlacementPractice.CommonQuestions;

public class ArmStrong {
    
    public static int findlen(int n){
        int sum = 0;
        while(n>0){
            n = n / 10;
            sum++;
        }
        return sum;
    }
    
    static int root(int n,int len){
        int num = n;
        for(int i=1;i<len;i++){
            num = n * num;
        }
        return num;
    }
    
    public static void main(String[] args) {
        int n = 153;
        int num = n;
        int sum = 0;
        int len = findlen(n);
        while(n>0){
            int ln = n % 10;
            sum += root(ln,len);
            n = n / 10;
        }
        if(sum==num){   
            System.out.println("Arm Strong");
            return;
        }
        System.out.println("Not Arm Strong");
    }
}