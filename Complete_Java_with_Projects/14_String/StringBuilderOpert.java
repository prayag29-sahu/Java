public class StringBuilderOpert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rohan");
        
        String str = sb.toString();
        System.out.println(str); // Rohan
        
        sb.deleteCharAt(2);
        System.out.println(sb); // Roan
        
        sb.insert(0, "Java");
        System.out.println(sb); // JavaRoan
        
        sb.insert(6, "java");
        System.out.println(sb); // JavaRojavaan
        
        sb.setLength(30);
        sb.ensureCapacity(100);
        System.out.println(sb.length()); // 30
        System.out.println(sb.capacity()); // 100
    }
}
