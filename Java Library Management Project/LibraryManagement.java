import java.util.*;

public class LibraryManagement {
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        library.loadDummyData(); 
        library.start();
    }
}

class LibrarySystem {
    private final Scanner sc = new Scanner(System.in);
    private final List<User> users = new ArrayList<>();
    private final List<Book> books = new ArrayList<>();

    public void start() {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 : register();break;
                case 2 : login();break;
                case 3 : {
                    System.out.println("Thank you for using the library system.");
                    return;
                }
                default : System.out.println("Invalid choice.");
            }
        }
    }

    private void register() {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Set a 4-digit PIN: ");
        int pin = sc.nextInt();
        int userId = (int) (Math.random() * 100000);
        users.add(new User(name, userId, pin));
        System.out.println("Registered successfully! Your User ID is: " + userId);
    }

    private void login() {
        System.out.print("Enter User ID: ");
        int id = sc.nextInt();
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        User user = findUser(id, pin);
        if (user == null) {
            System.out.println("Invalid credentials.");
            return;
        }

        boolean session = true;
        while (session) {
            System.out.println("\nWelcome, " + user.name);
            System.out.println("1. View Available Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. View Borrow History");
            System.out.println("5. Logout");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 : viewBooks();break;
                case 2 : {
                    System.out.print("Enter Book ID to borrow: ");
                    int bookId = sc.nextInt();
                    borrowBook(user, bookId);
                }break;
                case 3 : {
                    System.out.print("Enter Book ID to return: ");
                    int bookId = sc.nextInt();
                    returnBook(user, bookId);
                }break;
                case 4 : user.printHistory();break;
                case 5 : session = false;break;
                default : System.out.println("Invalid option.");
            }
        }
    }

    private void viewBooks() {
        System.out.println("\n--- Available Books ---");
        boolean found = false;
        for (Book book : books) {
            if (!book.isBorrowed) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books available.");
        }
    }

    private void borrowBook(User user, int bookId) {
        for (Book book : books) {
            if (book.id == bookId && !book.isBorrowed) {
                book.isBorrowed = true;
                user.borrowBook(book);
                System.out.println("You borrowed: " + book.title);
                return;
            }
        }
        System.out.println("Book not available.");
    }

    private void returnBook(User user, int bookId) {
        Book book = user.returnBook(bookId);
        if (book != null) {
            for (Book b : books) {
                if (b.id == bookId) {
                    b.isBorrowed = false;
                    break;
                }
            }
            System.out.println("Book returned: " + book.title);
        } else {
            System.out.println("You didn't borrow this book.");
        }
    }

    private User findUser(int id, int pin) {
        for (User u : users) {
            if (u.id == id && u.pin == pin) return u;
        }
        return null;
    }

    public void loadDummyData() {
        books.add(new Book(101, "The Alchemist", "Paulo Coelho"));
        books.add(new Book(102, "Java Programming", "Herbert Schildt"));
        books.add(new Book(103, "Wings of Fire", "A.P.J. Abdul Kalam"));
        books.add(new Book(104, "Rich Dad Poor Dad", "Robert Kiyosaki"));
    }
}

class User {
    String name;
    int id;
    int pin;
    List<Book> borrowedBooks = new ArrayList<>();
    List<BorrowRecord> history = new ArrayList<>();

    public User(String name, int id, int pin) {
        this.name = name;
        this.id = id;
        this.pin = pin;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        history.add(new BorrowRecord(book, "Borrowed"));
    }

    public Book returnBook(int bookId) {
        for (Book b : borrowedBooks) {
            if (b.id == bookId) {
                borrowedBooks.remove(b);
                history.add(new BorrowRecord(b, "Returned"));
                return b;
            }
        }
        return null;
    }

    public void printHistory() {
        System.out.println("\n--- Borrow History ---");
        if (history.isEmpty()) {
            System.out.println("No borrow history.");
        } else {
            for (BorrowRecord record : history) {
                System.out.println(record.status + ": " + record.book.title);
            }
        }
    }
}

class Book {
    int id;
    String title;
    String author;
    boolean isBorrowed;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String toString() {
        return id + " - \"" + title + "\" by " + author;
    }
}

class BorrowRecord {
    Book book;
    String status;

    public BorrowRecord(Book book, String status) {
        this.book = book;
        this.status = status;
    }
}


// Demo 
/*
Library Management System
1. Register
2. Login
3. Exit
Choose: 1
Enter your name: Prayag sahu
Set a 4-digit PIN: 1234
Registered successfully! Your User ID is: 18702

Library Management System
1. Register
2. Login
3. Exit
Choose: 2
Enter User ID: 1234
Enter PIN: 1234
Invalid credentials.

Library Management System
1. Register
2. Login
3. Exit
Choose: 2
Enter User ID: 18702
Enter PIN: 1234

Welcome, Prayag sahu
1. View Available Books
2. Borrow Book
3. Return Book
4. View Borrow History
5. Logout
Choose: 1

--- Available Books ---
101 - "The Alchemist" by Paulo Coelho
102 - "Java Programming" by Herbert Schildt
103 - "Wings of Fire" by A.P.J. Abdul Kalam
104 - "Rich Dad Poor Dad" by Robert Kiyosaki

Welcome, Prayag sahu
1. View Available Books
2. Borrow Book
3. Return Book
4. View Borrow History
5. Logout
Choose: 2
Enter Book ID to borrow: 101
You borrowed: The Alchemist

Welcome, Prayag sahu
1. View Available Books
2. Borrow Book
3. Return Book
4. View Borrow History
5. Logout
Choose: 2
Enter Book ID to borrow: 102
You borrowed: Java Programming

Welcome, Prayag sahu
1. View Available Books
2. Borrow Book
3. Return Book
4. View Borrow History
5. Logout
Choose: 2
Enter Book ID to borrow: 103
You borrowed: Wings of Fire

Welcome, Prayag sahu
1. View Available Books
2. Borrow Book
3. Return Book
4. View Borrow History
5. Logout
Choose: 3
Enter Book ID to return: 102
Book returned: Java Programming

Welcome, Prayag sahu
1. View Available Books
2. Borrow Book
3. Return Book
4. View Borrow History
5. Logout
Choose: 4

--- Borrow History ---
Borrowed: The Alchemist
Borrowed: Java Programming
Borrowed: Wings of Fire
Returned: Java Programming

Welcome, Prayag sahu
1. View Available Books
2. Borrow Book
3. Return Book
4. View Borrow History
5. Logout
Choose: 5

Library Management System
1. Register
2. Login
3. Exit
Choose:
 */