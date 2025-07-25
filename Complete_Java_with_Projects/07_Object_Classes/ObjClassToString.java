
class Laptop {

    String model;
    int price;
//	String serial;

    public String toString() {
//		return "Hey";
        return model + " : " + price;
    }

    public boolean equals(Laptop that) {
//		if(this.model.equals(that.model) && this.price==that.price) 
//			return true;
//		else
//			return false;

        return this.model.equals(that.model) && this.price == that.price;
    }
}

public class ObjClassToString {

    public static void main(String[] args) {

        Laptop obj = new Laptop();
        obj.model = "Lenevo";
        obj.price = 63000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenevo";
        //   	obj2.model="Lenevo1";
        obj2.price = 63000;

        boolean result = obj.equals(obj2);
        if (result) {
            System.out.println(obj.toString());
        } else {
            System.out.println("Not equal");
        }
        
//   	System.out.println(obj);

    }
}
