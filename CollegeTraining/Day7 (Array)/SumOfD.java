class SumOfD {
    public static void main(String[] args) {
        int num = 121;
        int rem ;
        int res = 0;
        while(num>0)
        {
            rem = num%10;
            res = res + rem;
            num = num /10;
        }
        System.out.println(res);
    }
}