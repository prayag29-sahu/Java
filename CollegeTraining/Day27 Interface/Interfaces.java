interface client{
    void print();
    void show();
}

class Dev implements client{
    public void print(){
        System.out.println("bill");
    }
    public void show(){
        System.out.println("prices");
    }    
}


class Interfaces{
    public static void main(String[] args) {
        Dev d = new Dev();
        d.print();
        d.show();
    }
}
/*
bill
prices
 */