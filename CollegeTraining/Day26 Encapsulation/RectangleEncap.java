class Rectangle {
    private int l, b;

    public void set(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getArea() {
        return l * b;
    }

    public int getPeri() {
        return 2 * (l + b);
    }

}

public class RectangleEncap {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.set(4, 5);
        System.out.println("Area : " + r.getArea());
        System.out.println("Perimeter : " + r.getPeri());
    }

}
/*
 * Area : 20
 * Perimeter : 18
 */
