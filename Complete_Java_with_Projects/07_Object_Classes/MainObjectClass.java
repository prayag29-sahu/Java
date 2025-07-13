class ObjectClass {
    // This class is intentionally left empty for demonstration purposes.
}

public class MainObjectClass {
    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass();
        System.out.println(obj); // ObjectClass@7344699f
        System.out.println(obj.getClass()); // class ObjectClass
    }
}

