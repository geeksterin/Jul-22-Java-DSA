interface Parent {
    abstract void walk();
}

class Child implements Parent {

    public void walk() {
        System.out.println("Walking!!!");
    }

}

public class Interfaces {

    public static void main(String[] args) {

        System.out.println("\n");
        
        Child baby = new Child();
        baby.walk();

        System.out.println("\n");

    }

}