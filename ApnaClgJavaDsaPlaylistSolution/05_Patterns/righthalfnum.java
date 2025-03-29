
public class righthalfnum {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;

        /*
            7>
            1
            12
            123
            1234
            12345
        
         */
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
