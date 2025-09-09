import java.util.*;

public class IoTSensorReadings {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(45, 60, 75, 30, 90);
        int threshold = 50;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("High reading: " + r));
    }
}
