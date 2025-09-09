import java.time.LocalDateTime;
import java.util.List;

@FunctionalInterface
interface FareCalculator {
    double calculateFare(double distanceKm, int passengers);
}

interface TransportService {
    String getId();
    String getType();
    double getFarePerKm();
    boolean isAvailable(LocalDateTime when);
    List<String> getActiveRoutes();

    default void printServiceDetails() {
        System.out.println(getType() + " [" + getId() + "] - Fare/km: " + getFarePerKm());
    }

    static void log(String msg) {
        System.out.println("[TransportService] " + msg);
    }
}
