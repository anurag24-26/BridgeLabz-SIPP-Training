import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Reporting {
    public void generateRevenueReport(List<Trip> trips) {
        System.out.println("--- Revenue Report ---");
        // groupingBy route, summarizing fares
        Map<String, Double> totalByRoute = trips.stream()
                .collect(Collectors.groupingBy(Trip::getRoute, Collectors.summingDouble(Trip::getFare)));
        totalByRoute.forEach((route, total) ->
            System.out.println(route + " -> Total Fare: " + total)
        );

        // average fare per route
        Map<String, Double> avgByRoute = trips.stream()
                .collect(Collectors.groupingBy(Trip::getRoute, Collectors.averagingDouble(Trip::getFare)));
        avgByRoute.forEach((route, avg) ->
            System.out.println(route + " -> Avg Fare: " + avg)
        );

        // partition peak vs non-peak
        Map<Boolean, List<Trip>> peakPartition = trips.stream()
                .collect(Collectors.partitioningBy(t -> isPeakHour(t.getTimestamp())));
        System.out.println("Peak trips: " + peakPartition.get(true).size());
        System.out.println("Non-peak trips: " + peakPartition.get(false).size());

        // summarizingDouble for fares
        DoubleSummaryStatistics stats = trips.stream()
                .collect(Collectors.summarizingDouble(Trip::getFare));
        System.out.println("Count:" + stats.getCount() + " Sum:" + stats.getSum() + " Avg:" + stats.getAverage());
    }

    private boolean isPeakHour(LocalDateTime ts) {
        int h = ts.getHour();
        return (h >= 7 && h <= 10) || (h >= 17 && h <= 20);
    }
}
