interface Father {    
    abstract void walks();
    abstract void swim();
    static void eats() { 
        System.out.println("Father is eating.");
    }
}
interface Mother {    
    abstract void walks();
    abstract void party();
    static void eats() { 
        System.out.println("Mother is eating.");
    }
}

class Child implements Father, Mother {

    public void walks() {
        System.out.println("One step 30in apart.");;
    }
    public void swim() {
        System.out.println("Swimming is life");;
    }
    public void party() {
        System.out.println("Gurgaon Chaloooooo!!");;
    }
    public static void eats() {
        System.out.println("Child eats.");
    }

}


public class DiamondProblem_FamilyExample {

    public static void main(String[] args) {

        System.out.println("\n");
        
        Child shubh = new Child();

        shubh.walks();
        shubh.swim();
        shubh.party();
        shubh.eats();

        Father.eats();
        Mother.eats();

        System.out.println("\n");

    }

}