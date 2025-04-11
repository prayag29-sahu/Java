public class DogName {
    public static class Dog 
    {
        String name;
    }
    public static void main(String[] args) {
        Dog dn1 = new Dog();
        Dog dn2 = new Dog();
        Dog dn3 = new Dog();
        dn1.name="Tomy";
        dn2.name="Kitti";
        dn3.name="John";
        System.out.println("The three dogs name are : "+dn1.name+" "+dn2.name+" "+dn3.name);

    }
}
// o/p (The three dogs name are : Tomy Kitti John)
