package SortingTechniques;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        
        for(int i=0;i<arr.length-1;i++){
            int x = i;
            for(int j=i+1;j<arr.length;j++){
             if(arr[j]<arr[x]){
                    x=j;
                }  
            }
            int k = arr[x];
            arr[x]=arr[i];
            arr[i]=k;
        }
        return arr;
    }

    public static void main(String args[]){
        int[] arr = {5,4,3,2,1};
        int[] s = selectionSort(arr);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
