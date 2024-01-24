package Basics.BasicMaths;

public class ReverseInteger {
    public static int reverse(int x) {
        String st = Integer.toString(x);
        boolean flag = false;
        String output = "";
        for(int i=st.length()-1;i>=0;i--){
            if(st.charAt(i)=='-'){
                flag = true;
                continue;
            }
            output+=st.charAt(i);
        }
        if(flag){
            output="-"+output;
        }
        return Integer.parseInt(output);
    }

    public static void main(String[] args) {
        System.out.println(reverse(-321));
    }
}
