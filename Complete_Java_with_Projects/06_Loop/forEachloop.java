public class forEachloop {
    public static void main(String[] args) {
        int[] a=new int[5];
        for(int n : a){
            n = (int)(Math.random()*100);
            System.out.print(n+" ");
        }
    }
}
// 57 0 43 70 13 