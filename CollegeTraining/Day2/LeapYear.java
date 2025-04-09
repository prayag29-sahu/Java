public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        if(year%4==0&&(year%100!=0||year%400==0))
        {
            System.out.println("Year "+year+" was Leap year.");
        } else 
        {
            System.out.println("Year "+year+" was not a Leap year.");
        }
    }
    
}
// o/p (Year 2024 was Leap year.)