public class AccessVariable {
        public static void main(String[] args) {
        // here we use static with main because we call the main function without create object of AccessMethod class

        // System.out.println(s); // s variable which declare in same class but it gave error because nonstatic function

        System.out.println(st); // access because st declare static 

    }

    int s = 10;

    static int st = 20;
}
