package Basics.Recursion;

public class onetoNWithoutLoop {
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        print(arr,x);
        return arr;
    }

    static void print(int[] arr,int x){
        if(x==0){
            return;
        }
        arr[x-1]=x;
        x-=1;
        print(arr,x);
    }

    public static void main(String[] args) {
        System.out.println(printNos(5));
    }
}