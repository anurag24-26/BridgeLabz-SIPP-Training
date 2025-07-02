package Keywords_and_Instance;

public class Book {
    static String libraryName = "City Central Library";

    final String isbn;
    String title;
    String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }
}