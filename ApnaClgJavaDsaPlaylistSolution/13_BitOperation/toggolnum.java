import java.util.*;

public class toggolnum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // toggale number using set the position element different 29-11101 set positon in 3, 1 to 0 =  10101 = 21
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        System.out.print("Enter any position : ");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;
        int newnum  = n ^ (bitmask);
        System.out.println("Toggle number : "+newnum);

    }
    
}
