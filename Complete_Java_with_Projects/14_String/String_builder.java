public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rohan");

        // Convert StringBuilder to String
        String str = sb.toString();
        System.out.println(str); // Rohan

        // Delete character at index 2
        sb.deleteCharAt(2);
        System.out.println(sb); // Roan

        // Insert "Java" at index 0
        sb.insert(0, "Java");
        System.out.println(sb); // JavaRoan

        // Insert "java" at index 6
        sb.insert(6, "java");
        System.out.println(sb); // JavaRojavaan
    }
}
