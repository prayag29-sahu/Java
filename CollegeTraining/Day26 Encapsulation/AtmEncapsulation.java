class ATM {
    private int r; // private variable doesn't access from outside of class
    public void setR(int r){ // public method can be access from outside of class
        this.r=r; 
    }
    public int getR(){
        return r;
    }
}
class AtmEncapsulation {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.setR(5000);
        System.out.println(a.getR());
    }

}
// 5000