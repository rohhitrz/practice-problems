package Sorting;

public class QuickSort {

    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] <= pivot) i++;
            while (j > low && arr[j] >= pivot) j--;
            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);
        return j;
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Recursive Quick Sort function
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // pi is partitioning index, array is partitioned around pi
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
