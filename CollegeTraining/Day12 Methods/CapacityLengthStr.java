public class CapacityLengthStr {
    public static void main(String[] args) {

        // Capacity
        StringBuilder str = new StringBuilder(10);
        str.append("hello");
        System.out.println(str.length()); // 5
        System.out.println(str.capacity()); // 10

        StringBuilder str1 = new StringBuilder(10);
        str1.append("hello hii byyee");
        // capacity formula =  old*2+2 = 10*2+2 = 22 
        System.out.println(str1.length()); // 15
        System.out.println(str1.capacity()); // 22

        StringBuilder str2 = new StringBuilder('A');
        str2.append("hello hii byyee"); 
        System.out.println(str2.length()); // 15
        System.out.println(str2.capacity()); // 65

        StringBuilder str3 = new StringBuilder("A"); // capacity 1 ="A" , "Avfvd" = 5
        str3.append("hello hii byyee");
        System.out.println(str3.length()); // 16
        System.out.println(str3.capacity()); // 17
    }
}
