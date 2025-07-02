public class FloatVar {
    public static void main(String[] args) {
        
        float f = 34;
        System.out.println(f);  // 34.0
        
        float f1 = -34;
        System.out.println(f1);  // -34.0
        
        float f2= 34f;
        System.out.println(f2);  // 34.0
        
        // float f3 = 34.3424345;
        // System.out.println(f3);  //  incompatible types: possible lossy conversion from double to float

        float f4 = 34.3424345f;
        System.out.println(f4);  // 334.342434
    }
}
