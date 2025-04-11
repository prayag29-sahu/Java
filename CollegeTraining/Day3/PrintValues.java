public class PrintValues {
    public static class Book
    {
        String title,author;
        Book(String tite, String auth)
        {
            title = tite;
            author = auth; 
        }
        void display()
        {
            System.out.println("The Title of book is : "+title+" and the author is : "+author);
        }
    }
    public static void main(String[] args) {
        Book b = new Book("Mathematics", "Sanchit Sir");
        b.display();
    }
    
}
// o/p (The Title of book is : Mathematics and the author is : Sanchit Sir)
