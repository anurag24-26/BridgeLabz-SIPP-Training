import java.util.regex.*;

public class ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        String regex = "https?://[a-zA-Z0-9./-]+";

        Matcher matcher = Pattern.compile(regex).matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
