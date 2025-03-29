
public class invertrighthalfnum {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;

        /*
            8>
            12345
            1234
            123
            12
            1
        */
        
        for (int i = m; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
