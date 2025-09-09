import java.util.Arrays;
import java.util.Random;

public class SortingComparison {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int n = 10_000;
        int[] data = new Random().ints(n, 0, n).toArray();

        int[] arr1 = Arrays.copyOf(data, n);
        int[] arr2 = Arrays.copyOf(data, n);
        int[] arr3 = Arrays.copyOf(data, n);

        long start = System.nanoTime();
        bubbleSort(arr1);
        System.out.println("Bubble Sort: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        mergeSort(arr2);
        System.out.println("Merge Sort: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        quickSort(arr3, 0, n - 1);
        System.out.println("Quick Sort: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");
    }
}
