package Basics.BasicMaths;
import java.util.*;

public class ArmStrong {

	 public static boolean checkArmstrong(int n){
		String st = Integer.toString(n);
		int l = st.length();
		boolean flag = false;
		int temp = 0;
		for(int i=0;i<l;i++){
			temp += Math.pow(Character.getNumericValue(st.charAt(i)),l);
		}
		if(temp==n){
			flag=true;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		System.out.println(checkArmstrong(in));
        sc.close();
	}
}
