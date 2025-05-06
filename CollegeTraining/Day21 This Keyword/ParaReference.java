public class ParaReference {
    void print(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        ParaReference pf = new ParaReference();
        System.out.println(pf);
        pf.print(10);
    }
}
/*
ParaReference@251a69d7
10
 */
