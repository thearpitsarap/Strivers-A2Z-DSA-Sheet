package SortingTechniques;

public class QuickSort {
    public static void printa(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int parti(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[low];
        arr[low] = arr[j];
        arr[j] = t;

        return j;
    }

    public static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int j = parti(arr, low, high);
            qs(arr, low, j - 1);
            qs(arr, j + 1, high);
        }
    }

    public static void main(String args[]) {
        int[] arr = { 2, 6, 8, 5, 4, 3 };
        qs(arr, 0, arr.length - 1);
        printa(arr);
    }
}
