//final - variable, method, class

final class Calc {

    public void show() {
        System.out.println("in Calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}
// Cannot extend a final class
// class AdvCalc extends Calc {

//     public void show() {
//         System.out.println("By John");

//     }
// }

public class FinalClass {

    public static void main(String[] args) {

        // AdvCalc obj = new AdvCalc();
        // obj.show();
        // obj.add(4, 5);
        // cannot extend it bcs parent is final
        Calc obj = new Calc();
        obj.show();
        obj.add(4, 5);
    }

}
