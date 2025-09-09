import java.util.Arrays;

public class SearchComparison {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 1_000_000;
        int[] data = new int[n];
        for (int i = 0; i < n; i++) data[i] = i;
        int target = n - 1;

        long start = System.nanoTime();
        System.out.println("Linear Search index: " + linearSearch(data, target));
        System.out.println("Linear Search time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        System.out.println("Binary Search index: " + binarySearch(data, target));
        System.out.println("Binary Search time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");
    }
}
