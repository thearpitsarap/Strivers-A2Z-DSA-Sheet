package Basics.Recursion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindrome {
    static boolean flag = true;
     public static boolean isPalindrome(String s) {
         
        s = s.replaceAll("\\s", "").toLowerCase();
         
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(s);
        String newStr = matcher.replaceAll("");
         
        int n=newStr.length();
        int i=0;
        isPal(newStr,n,i);
        return flag;
    }

    public static void isPal(String s,int n,int i){

        if(n==0){
            return;
        }
        if(s.charAt(i) != s.charAt(n-1)){
            flag=false;
        }
        n-=1;
        i+=1;
        
        isPal(s,n,i);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}