class DigitEO 
{
    public static void main(String[] args) {
        int num = 123;
        int r;
        while(num>0){
            r = num%10;
            if(r%2==0){
                System.out.println(r+" is Even");
            }
            else{
                System.out.println(r+" is Odd");
            }
            num = num/10;

        }
    }
}