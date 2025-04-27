public class NonStaticPara {
    void parameter(String st){
        System.out.println("Method with "+st);
    }
    void nonpara(){
        System.out.println("Method Without parameter");
    }
    public static void main(String[] args) {
        String str = "Parameter";
        NonStaticPara p = new NonStaticPara();
        p.parameter(str);
        p.nonpara();
    }
    
}
/*
Method with Parameter
Method Without parameter
 */