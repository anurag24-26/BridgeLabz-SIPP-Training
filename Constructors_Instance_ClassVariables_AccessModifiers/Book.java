package  Constructors_Instance_ClassVariables_AccessModifiers;
class Book{
    String title;
    String author;
    double price;
    public Book(){
        title="Unknown";
        author="Unknown";
        price=0.0;
    }
     public Book(String t,String p,double PR){
        title=t;
        author=p;
        price=PR;
    }

    public void display(){
        System.out.println("Title of this book is" + title+"and Author is"+author+"with price Rs"+price);
    }
    public static void main(String[] args) {
        Book book1 = new Book(); // using default constructor
        Book book2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 299); // parameterized

        System.out.println("Default Book:");
        book1.display();

        System.out.println("\nParameterized Book:");
        book2.display();
    }
}