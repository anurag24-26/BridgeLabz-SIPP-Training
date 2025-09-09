import java.lang.annotation.*;
import java.lang.reflect.*;

@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

class BuggyClass {
    @BugReport(description = "NullPointer issue")
    @BugReport(description = "IndexOutOfBounds issue")
    public void buggyMethod() {}
}

public class Exercise5RepeatableAnnotation {
    public static void main(String[] args) throws Exception {
        Method m = BuggyClass.class.getMethod("buggyMethod");
        BugReport[] reports = m.getAnnotationsByType(BugReport.class);
        for (BugReport br : reports) {
            System.out.println("Bug: " + br.description());
        }
    }
}
