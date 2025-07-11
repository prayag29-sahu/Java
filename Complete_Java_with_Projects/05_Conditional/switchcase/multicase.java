public class multicase {
    public static void main(String[] args) {
        String day = "Saturday";
        switch (day) {
            case "Monday" ->
                System.out.println("Monday");
            case "Tuesday" ->
                System.out.println("Tuesday");
            case "Saturday" , "Sunday"-> 
                System.out.println("Holiday");
            default ->
                System.out.println("Enter a valid number");
        }
    } 
}
// Holiday