import java.lang.reflect.*;

class Person {
    private int age = 20;
}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);
        field.set(p, 30);
        System.out.println("Modified Age: " + field.get(p));
    }
}
