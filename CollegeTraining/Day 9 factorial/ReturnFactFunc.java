public class ReturnFactFunc {
    public static void fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factoral of "+n+" is : "+fact);
    }
    public static void main(String[] args) {
        int num = 5;
        fact(num);
    }
    
}
// Factoral of 5 is : 120