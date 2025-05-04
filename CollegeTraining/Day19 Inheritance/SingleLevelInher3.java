/*
✅ Question 12: Create a Program (Single-Level Inheritance)
Q: Write a Java program where:

Class Book has method read()

Class Novel inherits Book and has method storyLine()

Create an object of Novel and call both methods.
 */
class Book {
    void read() {
    System.out.println("Reading a book");
    }
   }
   class Novel extends Book {
    void storyLine() {
    System.out.println("The novel has an interesting storyline");
    }
   }
   
public class SingleLevelInher3 {
    public static void main(String[] args) {
        Novel n = new Novel();
        n.read();
        n.storyLine();
        }
    
}
/*
Reading a book
The novel has an interesting storyline
 */
