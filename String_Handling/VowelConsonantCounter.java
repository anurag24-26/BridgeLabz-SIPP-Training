package String_Handling;
public class VowelConsonantCounter {
    public static void main(String[] args) {
        String str = "Hello Java World!";
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        int vowels = 0, consonants = 0;

        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1)
                vowels++;
            else
                consonants++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
