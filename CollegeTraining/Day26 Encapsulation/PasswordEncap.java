class Password {
    private String Pass;
    public void setP (String Pass){
        this.Pass = Pass;
    }
    public String getP(){
        return Pass;
    }

}
public class PasswordEncap {
    public static void main(String[] args) {
        Password P = new Password();
        P.setP("joy@123");
        System.out.println(P.getP());
    }    
}
// joy@123