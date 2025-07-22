package Sorting;

import java.util.*;

public class MovieTime {
    public static void main(String[] args) {
        String[] shows = {"10:00", "12:30", "15:00", "18:00"};
        String newShow = "14:00";

        shows = insertAndSort(shows, newShow);

        System.out.println("Updated Showtimes:");
        for (String show : shows) {
            System.out.println(show);
        }
    }

    static String[] insertAndSort(String[] shows, String newShow) {
        List<String> list = new ArrayList<>(Arrays.asList(shows));
        list.add(newShow);

        // Insertion Sort
        for (int i = 1; i < list.size(); i++) {
            String key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }

        return list.toArray(new String[0]);
    }
}
