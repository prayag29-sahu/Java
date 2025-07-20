public class BuilderReverseReplace {
    public static void main(String[] args) {
        // StringBuilder example
        StringBuilder sb = new StringBuilder("Rohan");
        
        // Reverse the string
        sb.reverse();
        System.out.println("Reversed String: " + sb); // nahoR
        
        // Replace a substring
        sb.replace(0, 4, "Hello");
        System.out.println("After Replacement: " + sb); // Helloan
        
        // Convert StringBuilder to String
        String str = sb.toString();
        System.out.println("Converted to String: " + str); // Helloan
    }
}
