public class MobileName {
    public static class Mobile 
    {
        String Brand,Model;
    }
    public static void main(String[] args) {
        Mobile mob1 = new Mobile();
        Mobile mob2 = new Mobile();
        mob1.Brand = "Realme";
        mob2.Brand = "iphone";
        mob1.Model = "9A";
        mob2.Model = "15";
        System.out.println("The Detailse of mobile : Brand = "+mob1.Brand+" and Model = "+mob1.Model+"\n Brand = "+mob2.Brand+" and model = "+mob2.Model);

    }
    
}
/*
 * o/p (The Detailse of mobile : Brand = Realme and Model = 9A
        Brand = iphone and model = 15 )
 */
