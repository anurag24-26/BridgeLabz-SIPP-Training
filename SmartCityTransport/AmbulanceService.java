import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class AmbulanceService implements TransportService, EmergencyService {
    private final String id;
    private final double farePerKm = 0.0; // not charged here
    private final List<String> routes;

    public AmbulanceService(String id, String... routes) {
        this.id = id;
        this.routes = Arrays.asList(routes);
    }

    public String getId() { return id; }
    public String getType() { return "Ambulance"; }
    public double getFarePerKm() { return farePerKm; }
    public boolean isAvailable(LocalDateTime when) { return true; }
    public List<String> getActiveRoutes() { return routes; }

    // override default print behavior
    @Override
    public void printServiceDetails() {
        System.out.println(getType() + " [" + getId() + "] - Emergency (priority)");
    }
}
