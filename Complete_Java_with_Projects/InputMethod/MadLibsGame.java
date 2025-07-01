import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = input.nextLine();

        System.out.print("Enter a place: ");
        String place = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter a plural noun: ");
        String pluralNoun = input.nextLine();

        System.out.print("Enter a verb ending in -ing: ");
        String verbIng = input.nextLine();

        System.out.print("Enter a silly word: ");
        String sillyWord = input.nextLine();

        System.out.println("One day, " + name + " went to " + place + ".");
        System.out.println("It was a very " + adjective + " day.");
        System.out.println("Suddenly, a group of " + pluralNoun + " appeared,");
        System.out.println("all " + verbIng + " around shouting \"" + sillyWord + "!\"");
        System.out.println("It was the weirdest thing ever!");

        input.close();
    }
}
/*
Enter a name: Lucky
Enter a place: Goshalpur
Enter an adjective: sparkly  
Enter a plural noun: Monkeys
Enter a verb ending in -ing: dancing
Enter a silly word: blibberblop 
One day, Lucky went to Goshalpur.
It was a very sparkly day.
Suddenly, a group of Monkeys appeared,
all dancing around shouting "blibberblop!"
It was the weirdest thing ever!
 */