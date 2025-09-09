import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class BusService implements TransportService {
    private final String id;
    private final double farePerKm;
    private final List<String> routes;

    public BusService(String id, double farePerKm, String... routes) {
        this.id = id;
        this.farePerKm = farePerKm;
        this.routes = Arrays.asList(routes);
    }

    public String getId() { return id; }
    public String getType() { return "Bus"; }
    public double getFarePerKm() { return farePerKm; }
    public boolean isAvailable(LocalDateTime when) {
        // buses available daily 05:00 - 23:00
        int hr = when.getHour();
        return hr >= 5 && hr <= 23;
    }
    public List<String> getActiveRoutes() { return routes; }
}
