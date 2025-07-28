
class Calc {

    public final void show() {
        System.out.println("By Prayag");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

public class FinalMethod {

    public static void main(String[] args) {

        Calc obj = new Calc();
        obj.show();
        obj.add(4, 5);

    }

}
