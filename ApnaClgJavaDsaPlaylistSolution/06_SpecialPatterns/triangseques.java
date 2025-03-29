public class triangseques {
    public static void main(String[] args) {
        
        int n=4;
        int m=5;
    
            /*
            6>
                    1 
                   1 2
                  1 2 3
                 1 2 3 4
                1 2 3 4 5
             */
            for(int i=n;i>=0;i--)
            {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }        int num = 1;
                for (int j = 0; j <= n - i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
    }    
    }
    