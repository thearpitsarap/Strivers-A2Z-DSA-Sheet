package PlacementPractice;

public class LargestOddSubsting {
    public static String largestOddNumber(String num) {
        if(num.charAt(num.length()-1) % 2 != 0){
            return num;
        }
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i) - 2) % 2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String ans = largestOddNumber("35427");
        System.out.println(ans);
    }
}