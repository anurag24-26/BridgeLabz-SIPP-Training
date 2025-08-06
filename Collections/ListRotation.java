package Collections;

import java.util.*;

public class ListRotation {
    public static List<Integer> rotateList(List<Integer> list, int positions) {
        int size = list.size();
        if (size == 0 || positions % size == 0)
            return list;

        positions = positions % size; // Handle rotations greater than size
        List<Integer> rotated = new ArrayList<>();

        rotated.addAll(list.subList(positions, size));
        rotated.addAll(list.subList(0, positions));

        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;
        List<Integer> result = rotateList(input, rotateBy);
        System.out.println(result); // Output: [30, 40, 50, 10, 20]
    }
}
