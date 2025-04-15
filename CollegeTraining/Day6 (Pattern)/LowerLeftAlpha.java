public class LowerLeftAlpha {
    public static void main(String[] args) {
        for(char i='A';i<='E';i++){
            for(char j='A';j<=i;j++){
                System.out.print(j);  
            }
            System.out.println();
        }
    }
}
/*
 * o/p
(
A
AB
ABC
ABCD
ABCDE
)
 */