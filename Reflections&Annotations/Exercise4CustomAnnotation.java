import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority = "HIGH", assignedTo = "Alice")
    public void task1() {}
}

public class Exercise4CustomAnnotation {
    public static void main(String[] args) throws Exception {
        Method m = TaskManager.class.getMethod("task1");
        TaskInfo info = m.getAnnotation(TaskInfo.class);
        System.out.println("Priority: " + info.priority());
        System.out.println("Assigned To: " + info.assignedTo());
    }
}
