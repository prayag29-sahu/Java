/*
 * Create a class named Library with a static variable total_books and an instance variable
book_name. Inside the main method increment total_books and assigns a book name. Print the
total_books & book_name.
 */

public class LibraryDetails {
    public static class Library {
        static int total_books = 0 ;
        String book_name;
    }
    public static void main(String[] args) {
        Library l1 = new Library();
        l1.total_books++;
        l1.book_name = "Java";
        System.out.println("Total number of books : "+l1.total_books+" and Book name : "+l1.book_name);
    }
}
// o/p (Total number of books : 1 and Book name : Java)