public class SetGetNameThread {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setName("Its an thread.");
        System.out.println(t.getName());
    }
    
}
// Its an thread.