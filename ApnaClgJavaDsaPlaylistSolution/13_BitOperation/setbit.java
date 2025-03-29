public class setbit {
    public static void main(String[] args) {
        
        int n = 5;//101
        int pos = 2;//1
        int bitmask = 1<<pos; // 001<<2 -> 100

        // setbit
        int newnum = bitmask | n; // 100 | 101 = 101 = 5(o/p)
        System.out.println(newnum); 

    }
    
}
