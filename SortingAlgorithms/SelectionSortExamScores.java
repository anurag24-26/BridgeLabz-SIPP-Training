package SortingAlgorithms;

public class SelectionSortExamScores {
    public static void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIdx]) minIdx = j;
            }
            int temp = scores[i]; scores[i] = scores[minIdx]; scores[minIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {85, 60, 95, 70, 90};
        selectionSort(scores);
        for (int score : scores) System.out.print(score + " ");
    }
}
