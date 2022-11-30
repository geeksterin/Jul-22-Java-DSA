interface P1 {    
    abstract void f1();
    abstract void f2();
}
interface P2 {    
    void f2();
    abstract void f3();
}

class Child implements P1, P2 {

    public void f1() {
        System.out.println("F1");;
    }
    public void f2() {
        System.out.println("F2");;
    }
    public void f3() {
        System.out.println("F3");;
    }

}


public class DiamondProblem {

    public static void main(String[] args) {

        System.out.println("\n");
        
        Child c = new Child();

        c.f1();
        c.f2();
        c.f3();

        System.out.println("\n");

    }

}