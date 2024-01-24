package Basics.BasicMaths;

public class  CountDigits {
    public static int countDigits(int n){
        String st = Integer.toString(n);
        int t = 0;
        for(int i=0;i<st.length();i++){
            int in = Character.getNumericValue(st.charAt(i));
            if(in == 0){
                continue;
            }
            if(n % in==0){
                t+=1;
            }
        }
        return t;
    }
    public static void main(String[] args) {
        countDigits(660);
    }
}