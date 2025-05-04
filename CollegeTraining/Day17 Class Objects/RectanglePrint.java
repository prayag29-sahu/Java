/*
3. Create a class Rectangle with length and breadth as fields. Add methods to calculate area and
perimeter. Create objects with different values and call those methods.
*/
class Rectangle {
    int length;
    int breadth;
    Rectangle(int l,int b) {
        length = l;
        breadth= b;
    }
    void Area(){
        System.out.println("Area : "+length*breadth);
    }
    void Perimeter(){
        System.out.println("Perimeter : "+2*(length+breadth));
    }
    
}
public class RectanglePrint {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 10);
        Rectangle r2 = new Rectangle(10, 15);
        r1.Area();
        r1.Perimeter();
        r2.Area();
        r2.Perimeter();
    }
}
/*
Area : 100
Perimeter : 40
Area : 150
Perimeter : 50
 */