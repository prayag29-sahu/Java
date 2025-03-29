import java.util.*;
public class TicTac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] a = new char[3][3];
        int n =1;

        a[0][0]='1'; a[0][1]='2'; a[0][2]='3';

        a[1][0]='4'; a[1][1]='5'; a[1][2]='6';

        a[2][0]='7'; a[2][1]='8'; a[2][2]='9';

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        do { 
            System.out.println("Player 1 Tern With 'X' Input (1-9) : " );
            char X = sc.next().charAt(0);
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    if(a[i][j]==X)
                    {
                        a[i][j]='X';
                    }
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }

            if(a[0][0]=='X'&&a[0][1]=='X'&&a[0][2]=='X')
            {
                System.out.println("Player 1 Won .");
                break;
            }
            else if(a[1][0]=='X'&&a[1][1]=='X'&&a[1][2]=='X')
            {
                System.out.println("Player 1 Won .");
                break;
            }
            else if(a[2][0]=='X'&&a[2][1]=='X'&&a[2][2]=='X')
            {
                System.out.println("Player 1 Won .");
                break;
            }
            else if(a[0][0]=='X'&&a[1][0]=='X'&&a[2][0]=='X')
            {
                System.out.println("Player 1 Won .");
                break;
            }
            else if(a[0][1]=='X'&&a[1][1]=='X'&&a[2][1]=='X')
            {
                System.out.println("Player 1 Won .");
                break;
            }
            else if(a[0][2]=='X'&&a[1][2]=='X'&&a[2][2]=='X')
            {
                System.out.println("Player 1 Won .");
                break;
            }
            else if(a[0][0]=='X'&&a[1][1]=='X'&&a[2][2]=='X')
            {
                System.out.println("Player 1 Won .");
                break;
            }
            else if(a[0][2]=='X'&&a[1][1]=='X'&&a[2][0]=='X')
            {
                System.out.println("Player 1 Won .");
                break;
            }



            char O = sc.next().charAt(0);
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    if(a[i][j]==O)
                    {
                        a[i][j]='O';
                    }
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }

            if(a[0][0]=='O'&&a[0][1]=='O'&&a[0][2]=='O')
            {
                System.out.println("Player 2 Won .");
                break;
            }
            else if(a[1][0]=='O'&&a[1][1]=='O'&&a[1][2]=='O')
            {
                System.out.println("Player 2 Won .");
                break;
            }
            else if(a[2][0]=='O'&&a[2][1]=='O'&&a[2][2]=='O')
            {
                System.out.println("Player 2 Won .");
                break;
            }
            else if(a[0][0]=='O'&&a[1][0]=='O'&&a[2][0]=='O')
            {
                System.out.println("Player 2 Won .");
                break;
            }
            else if(a[0][1]=='O'&&a[1][1]=='O'&&a[2][1]=='O')
            {
                System.out.println("Player 2 Won .");
                break;
            }
            else if(a[0][2]=='O'&&a[1][2]=='O'&&a[2][2]=='O')
            {
                System.out.println("Player 2 Won .");
                break;
            }
            else if(a[0][0]=='O'&&a[1][1]=='O'&&a[2][2]=='O')
            {
                System.out.println("Player 2 Won .");
                break;
            }
            else if(a[0][2]=='O'&&a[1][1]=='O'&&a[2][0]=='O')
            {
                System.out.println("Player 2 Won .");
                break;
            }
            
        } while (n<4);

        sc.close();
    }
}
