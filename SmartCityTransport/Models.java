import java.time.LocalDateTime;

public class Passenger {
    private final String id;
    private final String name;

    public Passenger(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() { return id; }
    public String getName() { return name; }
}

class Trip {
    private final String id;
    private final Passenger passenger;
    private final String route;
    private final double fare;
    private final LocalDateTime timestamp;

    public Trip(String id, Passenger passenger, String route, double fare, LocalDateTime timestamp) {
        this.id = id;
        this.passenger = passenger;
        this.route = route;
        this.fare = fare;
        this.timestamp = timestamp;
    }

    public Passenger getPassenger() { return passenger; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
