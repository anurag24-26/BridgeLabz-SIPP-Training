package Constructors_Instance_ClassVariables_AccessModifiers;

class BookBorrow {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public BookBorrow(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // default available
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title);
            return true;
        } else {
            System.out.println("Book is not available.");
            return false;
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned: " + title);
    }
}
