package SortingTechniques;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]){
        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        int[] s = bubbleSort(arr);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
