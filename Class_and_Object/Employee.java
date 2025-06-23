package Class_and_Object;
class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Ankit", 101, 50000);
        emp.displayDetails();
    }
}
