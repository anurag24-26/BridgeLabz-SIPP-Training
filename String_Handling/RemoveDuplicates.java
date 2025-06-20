package String_Handling;
public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String result = "";

        for (char ch : input.toCharArray()) {
            if (result.indexOf(ch) == -1)
                result += ch;
        }

        System.out.println("Without duplicates: " + result);
    }
}
