package SortingAlgorithms;

public class HeapSortSalaries {
    public static void heapSort(int[] salaries) {
        int n = salaries.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(salaries, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = salaries[0]; salaries[0] = salaries[i]; salaries[i] = temp;
            heapify(salaries, i, 0);
        }
    }

    public static void heapify(int[] salaries, int n, int i) {
        int largest = i, left = 2 * i + 1, right = 2 * i + 2;
        if (left < n && salaries[left] > salaries[largest]) largest = left;
        if (right < n && salaries[right] > salaries[largest]) largest = right;
        if (largest != i) {
            int swap = salaries[i]; salaries[i] = salaries[largest]; salaries[largest] = swap;
            heapify(salaries, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaries = {45000, 32000, 50000, 28000, 60000};
        heapSort(salaries);
        for (int sal : salaries) System.out.print(sal + " ");
    }
}
