
package Lambda_Expressions;

import java.util.Arrays;
import java.util.List;

/**
 * Scenario:
 * Need to print all patient IDs from a list for admin verification.
 * Use method references instead of lambdas.
 */
public class PatientIdPrinting {

    public static void runDemo() {
        List<String> patientIds = Arrays.asList("P001", "P002", "P003", "P004");

        // Method reference to println (instead of ids.forEach(id ->
        // System.out.println(id)))
        patientIds.forEach(System.out::println);
    }
}
