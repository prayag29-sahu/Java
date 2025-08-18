
import java.util.Scanner;

// Base class for pages
abstract class Page {

    private String title;2
    

    public Page(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void display();
}

// Subclasses for each page
class HomePage extends Page {

    public HomePage() {
        super("Home");
    }

    @Override
    public void display() {
        System.out.println("=== Welcome to The Grand Hotel ===");
        System.out.println("Your comfort is our priority!");
        System.out.println("Navigate through our services using the menu.");
        System.out.println("--------------------------------------------");
    }
}

class AboutPage extends Page {

    public AboutPage() {
        super("About");
    }

    @Override
    public void display() {
        System.out.println("=== About Us ===");
        System.out.println("The Grand Hotel has been serving guests since 1995.");
        System.out.println("Located in the heart of the city with world-class hospitality.");
        System.out.println("--------------------------------------------");
    }
}

class ServicesPage extends Page {

    public ServicesPage() {
        super("Services");
    }

    @Override
    public void display() {
        System.out.println("=== Our Services ===");
        System.out.println("1. Luxury Rooms");
        System.out.println("2. 24/7 Room Service");
        System.out.println("3. Free Wi-Fi");
        System.out.println("4. Spa and Fitness Center");
        System.out.println("5. Restaurant & Bar");
        System.out.println("--------------------------------------------");
    }
}

class ContactPage extends Page {

    public ContactPage() {
        super("Contact");
    }

    @Override
    public void display() {
        System.out.println("=== Contact Us ===");
        System.out.println("Phone: +91-9876543210");
        System.out.println("Email: info@grandhotel.com");
        System.out.println("Address: MG Road, Mumbai, India");
        System.out.println("--------------------------------------------");
    }
}

// Room class
class Room {

    private int roomNumber;
    private String type;
    private double pricePerNight;
    private boolean available;

    public Room(int roomNumber, String type, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.available = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Room #" + roomNumber + " (" + type + ") - Rs." + pricePerNight
                + "/night - " + (available ? "Available" : "Booked");
    }
}

// Booking class
class Booking {

    private String guestName;
    private Room room;
    private int nights;

    public Booking(String guestName, Room room, int nights) {
        this.guestName = guestName;
        this.room = room;
        this.nights = nights;
    }

    public double calculateTotal() {
        return room.getPricePerNight() * nights;
    }

    @Override
    public String toString() {
        return "Booking for " + guestName + " in " + room.getType()
                + " Room #" + room.getRoomNumber() + " for " + nights
                + " nights. Total: Rs." + calculateTotal();
    }
}

// BookingPage class
class BookingPage extends Page {

    private Room[] rooms;
    private Booking[] bookings;
    private int bookingCount = 0;

    public BookingPage() {
        super("Booking");
        rooms = new Room[]{
            new Room(101, "Single", 2000),
            new Room(102, "Double", 3500),
            new Room(103, "Suite", 6000)
        };
        bookings = new Booking[10]; // up to 10 bookings
    }

    @Override
    public void display() {
        System.out.println("=== Book a Room ===");
        Scanner sc = new Scanner(System.in);

        System.out.println("Available Rooms:");
        for (Room r : rooms) {
            System.out.println(r);
        }

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter room number to book: ");
        int roomNumber = sc.nextInt();

        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        Room selected = null;
        for (Room r : rooms) {
            if (r.getRoomNumber() == roomNumber && r.isAvailable()) {
                selected = r;
                break;
            }
        }

        if (selected != null) {
            selected.setAvailable(false);
            Booking b = new Booking(name, selected, nights);
            bookings[bookingCount++] = b;
            System.out.println("Booking successful!");
            System.out.println(b);
        } else {
            System.out.println("Invalid room number or room not available.");
        }

        System.out.println("--------------------------------------------");
    }
}

// Main class
public class HotelManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Page home = new HomePage();
        Page about = new AboutPage();
        Page services = new ServicesPage();
        Page contact = new ContactPage();
        Page booking = new BookingPage();

        int choice;
        do {
            System.out.println("=== Hotel Management System ===");
            System.out.println("1. Home");
            System.out.println("2. About");
            System.out.println("3. Services");
            System.out.println("4. Contact");
            System.out.println("5. Booking");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    home.display();
                    break;
                case 2:
                    about.display();
                    break;
                case 3:
                    services.display();
                    break;
                case 4:
                    contact.display();
                    break;
                case 5:
                    booking.display();
                    break;
                case 0:
                    System.out.println("Thank you for visiting The Grand Hotel!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
