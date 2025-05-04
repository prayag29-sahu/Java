public class ZeroTo2ParaConstThis {

    ZeroTo2ParaConstThis() {
        System.out.println(10);
    }

    // One Parameter Constructor
    ZeroTo2ParaConstThis(int x) {
        this();
        System.out.println(20);
    }

    ZeroTo2ParaConstThis(int x, int y) {
        this(12);
        System.out.println(30);
    }

    public static void main(String[] args) {
        ZeroTo2ParaConstThis c = new ZeroTo2ParaConstThis(10, 20);
    }

}
/*
10
20
30
 */