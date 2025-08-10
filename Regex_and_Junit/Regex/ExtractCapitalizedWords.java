import java.util.regex.*;

public class ExtractCapitalizedWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex = "\\b[A-Z][a-zA-Z]*\\b";

        Matcher matcher = Pattern.compile(regex).matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
