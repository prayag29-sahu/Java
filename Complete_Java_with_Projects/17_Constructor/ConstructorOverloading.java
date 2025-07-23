class Human {

    public Human() {
        System.out.println("Non para constructor");
    }

    public Human(int a) {
        System.out.println(a + " Parameterised constructor");
    }
    public Human(int a,double d){
        System.out.println(a+d);
    }

}
class ConstructorOverloading {

    public static void main(String[] args) {
        Human h = new Human();
        Human h1 = new Human(6);
        Human h2 = new Human(6,5.3);

    }
}
/*
Non para constructor
6 Parameterised constructor
11.3
 */

