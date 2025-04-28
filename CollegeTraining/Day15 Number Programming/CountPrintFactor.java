// 13.	WAP to count all the factors of a given number and display it
public class CountPrintFactor {
    public static void main(String[] args) {
        int n = 33;
        int count = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
/*
1 3 11 33 
4
 */