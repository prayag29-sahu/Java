public class clearbit {
    public static void main(String[] args) {
        
        int n = 5;//101
        int pos = 2;//1
        int bitmask = 1<<pos; // 001<<2 -> 100

        // clearbit
        int notbitmask = ~(bitmask); // 011
        int newnum = notbitmask & n; // 011 & 101 = 001 = 1(o/p)
        System.out.println(newnum);
    }
    
}
