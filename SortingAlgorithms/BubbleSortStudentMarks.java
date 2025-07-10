package SortingAlgorithms;

public class BubbleSortStudentMarks {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (marks[i] > marks[i + 1]) {
                    int temp = marks[i];
                    marks[i] = marks[i + 1];
                    marks[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] marks = {88, 75, 92, 68, 90};
        bubbleSort(marks);
        for (int mark : marks) System.out.print(mark + " ");
    }
}
