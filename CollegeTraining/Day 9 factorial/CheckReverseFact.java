public class CheckReverseFact {
    public static void main(String[] args) {
        int num = 120;
        int i=2;
        while(num>1){
            if(num%i!=0){
                System.out.println("No");
                return;
            }
            num=num/i;
            i++;
        }
        System.out.println("Yes");
    }
}
// Yes
