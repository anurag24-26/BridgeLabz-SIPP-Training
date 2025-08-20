package Functional_Interfaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface DateUtils {
    static String formatDate(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }
}
