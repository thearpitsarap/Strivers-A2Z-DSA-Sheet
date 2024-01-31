package SortingTechniques;
public class MergeSort {
    public static void printArray(int A[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println(A[i]);
        }
        System.out.println();
    }

    public static void merge(int A[], int mid, int low, int high)
    {
        int i, j, k;
        int B[] = new int[100];
        i = low;
        j = mid + 1;
        k = low;

        while (i <= mid && j <= high)
        {
            if (A[i] < A[j])
            {
                B[k] = A[i];
                i++;
                k++;
            }
            else
            {
                B[k] = A[j];
                j++;
                k++;
            }
        }
        while (i <= mid)
        {
            B[k] = A[i];
            k++;
            i++;
        }
        while (j <= high)
        {
            B[k] = A[j];
            k++;
            j++;
        }
        for (int f = low; f <= high; f++)
        {
            A[f] = B[f];
        }

    }

    public static void mergeSort(int A[], int low, int high){
        int mid; 
        if(low<high){
            mid = (low + high) /2;
            mergeSort(A, low, mid);
            mergeSort(A, mid+1, high);
            merge(A, mid, low, high);
        }
    }



    public static void main(String args[]){
        int[] arr = {9, 1, 4, 14, 4, 15, 6};
        mergeSort(arr, 0, 6);
        printArray(arr, arr.length);
    }
}
