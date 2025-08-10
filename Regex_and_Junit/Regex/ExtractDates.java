import java.util.regex.*;

public class ExtractDates {
    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Matcher matcher = Pattern.compile(regex).matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
