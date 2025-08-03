
class PrayagException extends Exception {

    public PrayagException(String string) {
        super(string);
    }
}

class A {

    public void show() throws ClassNotFoundException {
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

        Class.forName("Calc");
    }
}

public class Ducking {

    static {
        System.out.println("Class Loader");
    }

    public static void main(String[] args) {

//    	try
//    	{
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
