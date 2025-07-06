package LinkedList;
class StudentNode {
    int rollNo;
    String name;
    int age;
    String grade;
    StudentNode next;

    StudentNode(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    StudentNode head;

    // Add at beginning
    public void addFirst(int rollNo, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addLast(int rollNo, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Add at specific position (0-based index)
    public void addAtPosition(int index, int rollNo, String name, int age, String grade) {
        if (index == 0) {
            addFirst(rollNo, name, age, grade);
            return;
        }
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        StudentNode current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("❌ Invalid position");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete by roll number
    public void deleteByRollNo(int rollNo) {
        if (head == null) return;

        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }

        StudentNode current = head;
        while (current.next != null && current.next.rollNo != rollNo) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("❌ Student not found.");
        } else {
            current.next = current.next.next;
            System.out.println("✅ Student deleted.");
        }
    }

    // Search by roll number
    public void searchByRollNo(int rollNo) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNo == rollNo) {
                System.out.println("✅ Found: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("❌ Student not found.");
    }

    // Update grade
    public void updateGrade(int rollNo, String newGrade) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNo == rollNo) {
                current.grade = newGrade;
                System.out.println("✅ Grade updated.");
                return;
            }
            current = current.next;
        }
        System.out.println("❌ Student not found.");
    }

    // Display all students
    public void displayAll() {
        if (head == null) {
            System.out.println("📭 No students found.");
            return;
        }

        StudentNode current = head;
        System.out.println("📚 Student Records:");
        while (current != null) {
            System.out.println("Roll No: " + current.rollNo + ", Name: " + current.name +
                    ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        // Sample operations
        list.addFirst(101, "Ravi", 17, "B");
        list.addLast(102, "Priya", 18, "A");
        list.addAtPosition(1, 103, "Amit", 16, "C");

        list.displayAll();

        list.searchByRollNo(102);
        list.updateGrade(101, "A+");
        list.deleteByRollNo(103);
        list.displayAll();
    }
}
