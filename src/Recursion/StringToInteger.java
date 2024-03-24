package Recursion;

public class StringToInteger {
    public static int myAtoi(String s) {
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(ans.length()>0 && !Character.isDigit(s.charAt(i))){
                break;
            }
            else if(s.charAt(i)==' '){
                continue;
            }
            else{
                ans+=s.charAt(i);
            }
        }
        
        try{
            if(Double.parseDouble(ans) < -2147483648){
                return -2147483648;
            }
            else if(Double.parseDouble(ans) > 2147483647){
                return 2147483647;
            }
            return Integer.parseInt(ans);
        }
        catch(Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("+-20"));
    }
}