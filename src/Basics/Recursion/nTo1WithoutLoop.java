package Basics.Recursion;

public class nTo1WithoutLoop {
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        print(arr,x);
        return arr;
    }
    
    static int y=0;
    static void print(int[] arr,int x){
        if( x==0) return;
        arr[y]=x;
        x-=1;
        y+=1;
        print(arr,x);
    }

    public static void main(String[] args) {
        System.out.println(printNos(5));
    }
}
