public class options {
    public static void main(String[] args) {
        int option = 2; 

        switch (option) {
            case 1:
                System.out.println("Option 1 selected: Perform action A");
                break;
            case 2:
                System.out.println("Option 2 selected: Perform action B");
                break;
            case 3:
                System.out.println("Option 3 selected: Perform action C");
                break;
            default:
                System.out.println("Invalid option selected");
        }
    }
}
// Option 2 selected: Perform action B