import java.util.*;
import java.util.stream.Collectors;

public class StudentResultGrouping {
    public static void main(String[] args) {
        Map<String, List<String>> students = new HashMap<>();
        students.put("Grade 10", Arrays.asList("Alice", "Bob"));
        students.put("Grade 11", Arrays.asList("Charlie", "David"));
        students.put("Grade 10", Arrays.asList("Eve"));

        // Example list of Student objects
        List<Student> studentList = Arrays.asList(
            new Student("Alice", "Grade 10"),
            new Student("Bob", "Grade 10"),
            new Student("Charlie", "Grade 11"),
            new Student("David", "Grade 11"),
            new Student("Eve", "Grade 10")
        );

        Map<String, List<String>> grouped = studentList.stream()
            .collect(Collectors.groupingBy(
                Student::getGrade,
                Collectors.mapping(Student::getName, Collectors.toList())
            ));

        System.out.println(grouped);
    }
}

class Student {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() { return name; }
    public String getGrade() { return grade; }
}
