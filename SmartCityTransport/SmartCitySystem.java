import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class SmartCitySystem {
    public static void main(String[] args) {
        ServiceRegistry registry = new ServiceRegistry();

        registry.register(new BusService("B1", 0.5, "Central-A", "North-C" ));
        registry.register(new BusService("B2", 0.45, "Central-A", "East-D" ));
        registry.register(new MetroService("M1", 0.75, "Central-A", "Airport" ));
        registry.register(new TaxiService("T1", 1.2, "Central-A", "North-C" ));
        registry.register(new AmbulanceService("AMB1", "CityWide" )); // emergency service

        // simulate a passenger booking
        LocalDateTime now = LocalDateTime.now();
        String desiredRoute = "Central-A";
        System.out.println("Passenger searching for route: " + desiredRoute + " at " + now);

        List<TransportService> options = registry.findAvailableServices(now, desiredRoute);
        // lambda to print with index
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i+1) + ") " + options.get(i).getType() + " - " + options.get(i).getId() + " Fare/km: " + options.get(i).getFarePerKm());
        }

        // Dashboard shows live
        Dashboard dash = new Dashboard();
        dash.showLiveSchedules(registry.getAllServices(), now);

        // simulate trips made (sample trips)
        Passenger p1 = new Passenger("P1", "Ravi");
        Passenger p2 = new Passenger("P2", "Sana");
        List<Trip> trips = Arrays.asList(
            new Trip("TR1", p1, "Central-A", 12.0, now.withHour(8)),
            new Trip("TR2", p2, "Central-A", 9.0, now.withHour(14)),
            new Trip("TR3", p1, "North-C", 6.0, now.withHour(18)),
            new Trip("TR4", p2, "Airport", 30.0, now.withHour(19))
        );

        // Reporting using streams & collectors
        Reporting reporting = new Reporting();
        reporting.generateRevenueReport(trips);

        // Identify emergency services via marker interface
        List<TransportService> emergency = registry.getAllServices().stream()
                .filter(s -> s instanceof EmergencyService)
                .collect(Collectors.toList());
        System.out.println("Emergency-capable services: ");
        emergency.forEach(TransportService::printServiceDetails);

        // FareCalculator functional interface usage (lambda)
        FareCalculator taxiFare = (distanceKm, passengers) -> distanceKm * 1.2 + (passengers > 1 ? 2.0 : 0.0);
        double fareEstimate = taxiFare.calculateFare(10.0, 2);
        System.out.println("Estimated taxi fare for 10km, 2 pax: " + fareEstimate);

        // Example of adding a new service (FerryService) would only require implementing TransportService
        TransportService.log("System ready. Services count: " + registry.getAllServices().size());
    }
}
