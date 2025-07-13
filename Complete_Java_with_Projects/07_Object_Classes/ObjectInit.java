class Object{

}
public class ObjectInit {
    public static void main(String[] args) {
    System.out.println(new Object());
    System.out.println(new Object().getClass());
    System.out.println(new Object().getClass().getName());
    System.out.println(new Object().getClass().getName().replace("Object", "MyObject"));

    }
}
/*
Object@7344699f
class Object
Object
MyObject
 */