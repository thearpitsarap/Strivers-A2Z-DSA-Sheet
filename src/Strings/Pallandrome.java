package Strings;

public class Pallandrome {
    public static void main(String[] args) {
        String s = "saas";        

        int l = 0;
        int r = s.length()-1;
        
        while(l<=r){
            while(l<=r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(l<=r && !Character.isLetterOrDigit(s.charAt(r))) r++;
                 
                        if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)) ){
                 System.out.println(false);
                            return;
            }
            l++;
            r--;
        }
        System.out.println("True");
    }
}
