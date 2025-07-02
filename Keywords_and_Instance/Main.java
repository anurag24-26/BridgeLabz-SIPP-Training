package Keywords_and_Instance;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Bank Account =====");
        BankAccount acc1 = new BankAccount(101, "Alice");
        acc1.displayDetails();
        BankAccount.getTotalAccounts();

        System.out.println("\n===== Book =====");
        Book book1 = new Book("ISBN1234", "Java Basics", "John Doe");
        book1.displayBookDetails();
        Book.displayLibraryName();

        System.out.println("\n===== Employee =====");
        Employee emp1 = new Employee(1, "Bob", "Developer");
        emp1.displayDetails();
        Employee.displayTotalEmployees();

        System.out.println("\n===== Product =====");
        Product prod1 = new Product("P001", "Laptop", 55000.00, 2);
        prod1.displayProductDetails();
        Product.updateDiscount(15.0);
        prod1.displayProductDetails();

        System.out.println("\n===== Student =====");
        Student stud1 = new Student(101, "Charlie", "A");
        stud1.displayStudent();
        Student.displayTotalStudents();

        System.out.println("\n===== Vehicle =====");
        Vehicle veh1 = new Vehicle("MH12AB1234", "David", "Car");
        veh1.displayRegistrationDetails();
        Vehicle.updateRegistrationFee(2000.0);
        veh1.displayRegistrationDetails();

        System.out.println("\n===== Patient =====");
        Patient pat1 = new Patient("PAT001", "Eve", 30, "Fever");
        pat1.displayPatientDetails();
        Patient.getTotalPatients();
    }
}