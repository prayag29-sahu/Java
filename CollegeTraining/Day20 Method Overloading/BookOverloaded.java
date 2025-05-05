/*
Design a class Book with overloaded methods to display book details in different formats.

One method should display the title and author, and another should display the title, author, and price.

 */
class BookDetails {
    void Book(String title,String author){
        System.out.println("Book Title : "+title+" Author : "+author);
    }
    void Book(String title,String author,double price){
        System.out.println("Book Title : "+title+" Author : "+author +" Price : "+price);
    }
}

public class BookOverloaded {
    public static void main(String[] args) {
        BookDetails bd = new BookDetails();
        bd.Book("Maila Anchal", "Fadhishwarnath");
        bd.Book("Maila Anchal", "Fadhishwarnath",200.50);
    }
}
/*
Book Title : Maila Anchal Author : Fadhishwarnath
Book Title : Maila Anchal Author : Fadhishwarnath Price : 200.5
 */