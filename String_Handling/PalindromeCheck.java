package String_Handling;
public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "madam";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--)
            reversed += input.charAt(i);

        if (input.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
