public class ReturnMethod {

    // static int sum(int a, int b){
    // return a+b;
    // }
    // static int print(){
    // return 'A';
    // }
    static int greater(int a, int b) {
        int c = a + b; //146
        int max=0;
        while(c>0){
        int rem = c%10; // 6,4,1
        if(rem>=max){
            max=rem;
        } // max = 6,
        c=c/10; // 14,1
        }
        return max;
        // int rem = c % 10;
        // c = c / 10;
        // if (rem > c) {
        //     return rem;
        // } else {
        //     return c;
        // }
    }


    public static void main(String[] args) {

        // System.out.println(sum(5,3)); // 8

        // int op = sum(4,5);
        // System.out.println(op); // 9

        // System.out.println(print()); // ASCII (65)

        // greater digit of sum num
        int op = greater(141, 5); // 146
        System.out.println(op); // 6
    }

}
