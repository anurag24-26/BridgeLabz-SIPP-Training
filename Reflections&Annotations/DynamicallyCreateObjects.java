import java.lang.reflect.*;

class Student {
    String name;
    public Student() { this.name = "Default Student"; }
}

public class DynamicallyCreateObjects {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Student.class;
        Object obj = clazz.getDeclaredConstructor().newInstance();
        System.out.println("Created Object: " + ((Student)obj).name);
    }
}
