package SortingTechniques;

public class RecursiveInsertionSort {

    public static void printa(int[] arr){
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
   

    public static void sortArr(int[] arr, int i, int n) {
        if (i == n) {
            return;
        }
        int j=i;
        while(j>0 && arr[j]<arr[j-1]){
            int t = arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=t;
            j--;
        }
        i+=1;
        sortArr(arr,i,n);
    }

    public static void insertionSort(int[] arr, int size) {
        sortArr(arr,0,size);
    }

    public static void main(String[] args) {
        int arr[] = {2, 13, 4, 1, 3, 6, 28};
        insertionSort(arr,arr.length);
        printa(arr);
    }
}
