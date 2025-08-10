public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        String text = "This   is   an   example   with   multiple   spaces.";
        String replaced = text.replaceAll(" +", " ");
        System.out.println(replaced);
    }
}
