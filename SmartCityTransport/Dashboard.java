import java.time.LocalDateTime;
import java.util.List;

public class Dashboard {
    public void showLiveSchedules(List<TransportService> services, LocalDateTime when) {
        System.out.println("--- Live Schedules @ " + when + " ---");
        // forEach to display schedules
        services.forEach(s -> {
            System.out.println(s.getType() + " " + s.getId() + " routes: " + s.getActiveRoutes());
        });
    }
}
