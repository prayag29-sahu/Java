public class withoutBreak {
        public static void main(String[] args) {
        int a = 5;
        int b = 10;

        switch (Integer.compare(a, b)) {
            case -1 ->
                System.out.println("a is smaller than b");
            case 1 ->
                System.out.println("b is smaller than a");
            default ->
                System.out.println("a is equal to b");
        }
    }
}
// a is smaller than b