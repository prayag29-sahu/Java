import java.util.Scanner;
// Write a method that takes two city names and prints "Traveling from Bhopal to Indore".
public class SentanceMethod {
        public static void Print(String str1, String str2)
    {
        System.out.println("Traveling from "+str1+" to "+str2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city1 = sc.nextLine();
        String city2 = sc.nextLine();
        Print(city1,city2);
        sc.close();
    }
    
}
/*
 * o/p (Bhopal
        Indore
        Traveling from Bhopal to Indore)
 */