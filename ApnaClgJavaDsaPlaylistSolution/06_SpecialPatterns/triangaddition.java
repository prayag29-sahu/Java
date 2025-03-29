public class triangaddition {
    public static void main(String[] args) {
        
        int n=4;
        int m=5;  
            /*
            5>
                    1 
                   1 1
                  1 2 1
                 1 3 3 1
                1 4 6 4 1
             */
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m - i; j++) {
                    System.out.print(" ");
                }
                int num = 1;
                for (int j = 0; j <= i; j++) {
                    System.out.print(num + " ");
                    num = num * (i - j) / (j + 1); 
                }
                System.out.println();
            }
    
    
    }    
    }
    