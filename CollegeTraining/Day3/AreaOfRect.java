public class AreaOfRect {
    public static class Rectangle 
    {
        int length,width;
        public Rectangle(int l, int w) {
            length=l;
            width=w;
        }
        int CalcuArea()
        {
            return length*width;
        }
        
    }
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10, 20);
        System.out.println("The Area of the rectangle is : "+rec.CalcuArea());
    }
}
// o/p (The Area of the rectangle is : 200)
