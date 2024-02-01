package Arrays.Easy;

import java.util.Arrays;

public class SecondLargestNumber {
    public static int[] getSecondOrderElements(int n, int []a) {
        int[] arr = new int[2];
        
        Arrays.sort(a);
        
        arr[0]=a[a.length-2];
        arr[1]=a[1];
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
        System.out.println(getSecondOrderElements(arr.length,arr));
    }
}
