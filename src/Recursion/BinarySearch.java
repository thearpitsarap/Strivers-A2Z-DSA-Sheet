package Recursion;

public class BinarySearch {
    public static int binarySearch(int[] arr,int l,int r,int k){
        
        int m = l + (r - l) / 2;
        if(arr[m]==k) return m;
        if(l>=r) return -1;
        
        if(arr[m]<k){
            return binarySearch(arr,m+1,r,k);
        }
        else{
            return binarySearch(arr,l,m-1,k);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
       System.out.println(binarySearch(arr,0,arr.length-1,2));
    }
}