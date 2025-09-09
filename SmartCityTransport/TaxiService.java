import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TaxiService implements TransportService {
    private final String id;
    private final double farePerKm;
    private final List<String> routes; // common service areas

    public TaxiService(String id, double farePerKm, String... routes) {
        this.id = id;
        this.farePerKm = farePerKm;
        this.routes = Arrays.asList(routes);
    }

    public String getId() { return id; }
    public String getType() { return "Taxi"; }
    public double getFarePerKm() { return farePerKm; }
    public boolean isAvailable(LocalDateTime when) {
        // taxis are 24/7 available in this simple model
        return true;
    }
    public List<String> getActiveRoutes() { return routes; }
}
