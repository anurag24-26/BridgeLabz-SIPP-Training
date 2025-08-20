package Functional_Interfaces;

import java.util.regex.*;

public interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password != null && password.length() >= 8 &&
                Pattern.compile("[A-Z]").matcher(password).find() &&
                Pattern.compile("[0-9]").matcher(password).find();
    }
}
