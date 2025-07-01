import java.util.*;

// Book class to represent each book
class Book {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Status: " + (isAvailable ? "Available" : "Checked Out"));
    }
}

// Custom Exception
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Library class to manage books
class Library {
    List<Book> bookList;
    Book[] bookArray;

    public Library() {
        bookList = new ArrayList<>();
    }

    // Initialize books and copy into array
    public void initializeBooks() {
        bookList.add(new Book("The Alchemist", "Paulo Coelho"));
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book("Clean Code", "Robert C. Martin"));
        bookList.add(new Book("Introduction to Algorithms", "CLRS"));

        // Convert list to array
        bookArray = bookList.toArray(new Book[0]);
    }

    // Search by partial title
    public void searchBook(String partialTitle) {
        boolean found = false;
        System.out.println("\nSearch results for: " + partialTitle);
        for (Book book : bookArray) {
            if (book.title.toLowerCase().contains(partialTitle.toLowerCase())) {
                book.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found matching: " + partialTitle);
        }
    }

    // Checkout book by title
    public void checkoutBook(String title) throws BookNotAvailableException {
        for (Book book : bookArray) {
            if (book.title.equalsIgnoreCase(title)) {
                if (book.isAvailable) {
                    book.isAvailable = false;
                    System.out.println("You have successfully checked out: " + book.title);
                    return;
                } else {
                    throw new BookNotAvailableException("The book '" + title + "' is already checked out.");
                }
            }
        }
        System.out.println("Book not found with title: " + title);
    }

    // Display all books
    public void displayBooks() {
        System.out.println("\nAll Books in Library:");
        for (Book book : bookArray) {
            book.display();
        }
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        lib.initializeBooks();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Display All Books");
            System.out.println("2. Search Book by Title");
            System.out.println("3. Checkout Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    lib.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter partial book title: ");
                    String search = sc.nextLine();
                    lib.searchBook(search);
                    break;
                case 3:
                    System.out.print("Enter exact book title to checkout: ");
                    String checkout = sc.nextLine();
                    try {
                        lib.checkoutBook(checkout);
                    } catch (BookNotAvailableException e) {
                        System.out.println("❌ " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the Library System!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
