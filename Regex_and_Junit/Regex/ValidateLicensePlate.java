import java.util.regex.*;

public class ValidateLicensePlate {
    public static void main(String[] args) {
        String[] plates = {"AB1234", "A12345"};
        String regex = "^[A-Z]{2}\d{4}$";

        for (String plate : plates) {
            if (plate.matches(regex)) {
                System.out.println(plate + " → Valid");
            } else {
                System.out.println(plate + " → Invalid");
            }
        }
    }
}
