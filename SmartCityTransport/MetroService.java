import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class MetroService implements TransportService {
    private final String id;
    private final double farePerKm;
    private final List<String> routes;

    public MetroService(String id, double farePerKm, String... routes) {
        this.id = id;
        this.farePerKm = farePerKm;
        this.routes = Arrays.asList(routes);
    }

    public String getId() { return id; }
    public String getType() { return "Metro"; }
    public double getFarePerKm() { return farePerKm; }
    public boolean isAvailable(LocalDateTime when) {
        // metro runs 04:30 - 01:00 next day
        int hr = when.getHour();
        return (hr >= 4 && hr <= 23) || (hr == 0);
    }
    public List<String> getActiveRoutes() { return routes; }
}
