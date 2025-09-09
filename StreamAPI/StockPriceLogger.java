import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(101.5, 102.3, 100.8, 105.2);
        stockPrices.forEach(price -> System.out.println("Stock Price: " + price));
    }
}
