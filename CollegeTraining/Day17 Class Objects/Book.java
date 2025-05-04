/*
 * 7. Create a class Book with title, author, and price. Add a method to apply a discount of 10% and
display the final price
 */
class BookDetails{
    String title;
    String author;
    double price;

    BookDetails(String t,String a,double p) {
        title = t;
        author = a;
        price = p;
    }
    void display(){
        System.out.println("Title of book : "+title);
        System.out.println("Author of book : "+author);
        price = price - (price*10)/100;
        System.out.println("Price of book after discount : "+price);
    }
    
}
class Book {
    public static void main(String[] args) {
        BookDetails b1 = new BookDetails("Panchtantr", "Premchand", 200);
        b1.display();
    }
}
/*
Title of book : Panchtantr
Author of book : Premchand
Price of book after discount : 180.0 
 */