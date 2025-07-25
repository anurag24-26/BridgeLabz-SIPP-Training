package Collections;
import java.util.*;
public class FrequencyCounter {
    public static void main(String[] args) {
   
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> frequencyMap = getFrequency(fruits);

        // Print result
        System.out.println(frequencyMap);
    }

    public static Map<String, Integer> getFrequency(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();

        for (String item : list) {
           
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }

        return freqMap;
    }
}
