class Temperature{
    private int c;
    public void Set(int c){
        this.c=c;
    }
    public int get(){
        int f;
        f= (c*(9/5))+32;
        return f;
    }
}
public class TemperatureEncap {
    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.Set(32);
        System.out.println("Temperature in Fahrenheit : "+t.get());
    }    
}
// t*9/5 +32 c-f
// t-32 *5/9 f-c
/*
Temperature in Fahrenheit : 64
 */