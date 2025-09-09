import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class ServiceRegistry {
    private final List<TransportService> services = new ArrayList<>();

    public void register(TransportService s) {
        services.add(s);
    }

    public List<TransportService> findAvailableServices(LocalDateTime when, String desiredRoute) {
        // Lambda filtering and sorting by fare then earliest type name
        return services.stream()
                .filter(s -> s.isAvailable(when))
                .filter(s -> s.getActiveRoutes().stream().anyMatch(r -> r.equalsIgnoreCase(desiredRoute)))
                .sorted((a, b) -> {
                    int cmp = Double.compare(a.getFarePerKm(), b.getFarePerKm());
                    if (cmp != 0) return cmp;
                    return a.getType().compareTo(b.getType());
                })
                .collect(Collectors.toList());
    }

    public void printAllServices() {
        // method reference for printing
        services.forEach(TransportService::printServiceDetails);
    }

    public List<TransportService> getAllServices() { return services; }
}
