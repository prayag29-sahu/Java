class Immutable {
    public static void main(String[] args) {
        // String str = "hello";

        // immutable
        // System.out.println(str.concat("hii"));
        // System.out.println(str);
        /* o/p
        hellohii
        hello
        */

        // mutable
        // StringBuilder str1 = new StringBuilder("hii");
        // str1.append("hello");
        // System.out.println(str1);
        // o/p  (hiihello)

        // Capacity
        // StringBuilder str = new StringBuilder(10);
        // str.append("hello");
        // System.out.println(str.length()); // 5
        // System.out.println(str.capacity()); // 10

        // StringBuilder str = new StringBuilder(10);
        // str.append("hello hii byyee");
        // // capacity formula =  old*2+2 = 10*2+2 = 22 
        // System.out.println(str.length()); // 15
        // System.out.println(str.capacity()); // 22

        // StringBuilder str = new StringBuilder('A');
        // str.append("hello hii byyee"); 
        // System.out.println(str.length()); // 15
        // System.out.println(str.capacity()); // 65

        StringBuilder str = new StringBuilder("A"); // capacity 1 ="A" , "Avfvd" = 5
        str.append("hello hii byyee");
        System.out.println(str.length()); // 16
        System.out.println(str.capacity()); // 17
        
    }
}