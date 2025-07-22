package Sorting;
import java.util.*;

public class FoodFest {
    public static void main(String[] args) {
        int[] zoneA = {100, 150, 200};
        int[] zoneB = {80, 160, 220};
        int[] zoneC = {90, 140, 210};

        int[] combined = mergeThreeZones(zoneA, zoneB, zoneC);

        System.out.println("Combined sorted footfall data:");
        for (int count : combined) {
            System.out.print(count + " ");
        }
    }

    static int[] mergeThreeZones(int[] a, int[] b, int[] c) {
        return merge(merge(a, b), c);
    }

    static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
