
class Reference {
    void sum(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        Reference r = new Reference();
        System.out.println(r);
        r.sum();
    }
}
/*;
Reference@251a69d7        
Reference@251a69d7
 */