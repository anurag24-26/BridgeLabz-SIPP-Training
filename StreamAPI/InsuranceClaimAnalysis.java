import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 10000),
            new Claim("Car", 5000),
            new Claim("Health", 12000),
            new Claim("Car", 7000),
            new Claim("Home", 15000)
        );

        Map<String, Double> avgClaims = claims.stream()
            .collect(Collectors.groupingBy(c -> c.type, Collectors.averagingDouble(c -> c.amount)));

        avgClaims.forEach((type, avg) -> System.out.println(type + " Avg Claim: " + avg));
    }
}
