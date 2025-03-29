
public class getbit {
    public static void main(String[] args) {
        
        int n = 5;//101
        int pos = 2;//1
        int bitmask = 1<<pos; // 001<<2 -> 100

        // get bit
        if((bitmask & n)==0) // 100 & 101 = 100 means 1(o/p) else 000 means 0
        {
            System.out.println("In This Position 0 Present");
        } else{
            System.out.println("In This Position 1 Present");
        }

    }
    
}
