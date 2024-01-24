// -2147483648 this test case doesn't pass with wrongReverse method.

package Basics.BasicMaths;
import java.math.BigInteger;

public class ReverseInteger {
    public static int wrongReverse(int x) {
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
        BigInteger one = new BigInteger(output);
        if(output.length()>9 && output.charAt(0)!='-'){
            return 0;
        }
        return one.intValue();
    }

    public static int rightReverse(int x){
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(wrongReverse(-2147483648));
        System.out.println(rightReverse(-2147483648));
    }
}
