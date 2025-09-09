import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "hello world hello java stream collectors world";

        Map<String, Long> wordCount = Arrays.stream(paragraph.split(" "))
            .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println(wordCount);
    }
}
