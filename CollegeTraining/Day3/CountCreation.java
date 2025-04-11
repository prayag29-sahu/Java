public class CountCreation {
    static int count;
    public static class Laptop
    {
        String brand;
        int RAM , Storage;

        public Laptop(String lapbran, int lapRAM,int lapstor) {
            brand = lapbran;
            RAM = lapRAM;
            Storage = lapstor;
            count++;
        }
        void display()
        {
            System.out.println("The Laptop Details : \n Brand = "+brand+" Ram = "+RAM+" GB Storage = "+Storage+" GB");
        }
        
    }
    public static void main(String[] args) {
        Laptop lap1 = new Laptop("HP", 8, 512);
        Laptop lap2 = new Laptop("Lenovo", 8, 512);
        Laptop lap3 = new Laptop("Asuse", 8, 512);
        lap1.display();
        lap2.display();
        lap3.display();
        System.out.println(count);
    }
    
    
}
/*
 * o/p (The Laptop Details : 
        Brand = HP Ram = 8 GB Storage = 512 GB
        The Laptop Details :
        Brand = Lenovo Ram = 8 GB Storage = 512 GB
        The Laptop Details :
        Brand = Asuse Ram = 8 GB Storage = 512 GB
3)
 */