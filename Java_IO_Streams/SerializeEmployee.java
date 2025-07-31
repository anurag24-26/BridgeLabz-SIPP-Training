package Java_IO_Streams;
import java.io.*;
import java.util.*;
class Employee implements Serializable {
    int id;
    String name, department;
    double salary;
    public Employee(int id, String name, String department, double salary) {
        this.id = id; this.name = name; this.department = department; this.salary = salary;
    }
    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}
class SerializeEmployee {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Alice", "HR", 30000));
        list.add(new Employee(2, "Bob", "IT", 40000));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.ser"));
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.ser"));
        List<Employee> retrieved = (List<Employee>) ois.readObject();
        for (Employee e : retrieved) System.out.println(e);
        ois.close();
    }
}
