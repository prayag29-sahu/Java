public class CircumOfCircle {
    public static class Circle
    {
        double radius;

        public Circle(double r) {
            radius = r;
        }
        double CalCircum()
        {
            double circum = 2.0*3.14*radius;
            return circum;
        }
        
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(4.5);
        Circle c2 = new Circle(6.25);

        System.out.println("The Circumference of 1st circle : "+c1.CalCircum()+" The Circumference of 2nd circle : "+c2.CalCircum());

    }
    
}
// o/p (The Circumference of 1st circle : 28.26 The Circumference of 2nd circle : 39.25)