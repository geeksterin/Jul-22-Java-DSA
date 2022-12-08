class A {
    int x = 1;
}
class B extends A {
    int x = 2;
}
class C extends B {
    int x = 3;
    void disp() {
        System.out.println("Cx: "+this.x);
        System.out.println("Bx: "+((B)this).x);
        System.out.println("Bx(using super): "+super.x);
        System.out.println("Ax: "+((A)this).x);
    }
}

public class ThisInMultipleInheritance {

    public static void main(String[] args) {

        System.out.println("\n");
        
        C obj = new C();
        obj.disp();

        System.out.println("\n");

    }

}