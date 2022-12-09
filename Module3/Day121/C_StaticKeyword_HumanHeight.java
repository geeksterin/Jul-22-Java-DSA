import java.util.* ;
import java.io.* ;

class Human {

    String name;
    float height;

    static float maxHumanHeight = 0;

    Human(String name, float height) {
        this.name = name;
        this.height = height;
        Human.maxHumanHeight = Math.max(Human.maxHumanHeight,height);
    }

    // void f1() {
    //     maxHumanHeight++;
    //     System.out.println(maxHumanHeight);
    // }
    // void f2() {
    //     maxHumanHeight--;
    //     System.out.println(maxHumanHeight);
    // }
    // void f3() {
    //     maxHumanHeight++;
    //     System.out.println(maxHumanHeight);
    // }

}

class C_StaticKeyword_HumanHeight {

    public static void main( String args[] ) {
        
        Human ambuj = new Human("Ambuj",5);
        System.out.println(Human.maxHumanHeight);

        Human mukul = new Human("Mukul",5.5f);
        System.out.println(Human.maxHumanHeight);

        Human vishal = new Human("Vishal",5.11f);
        System.out.println(Human.maxHumanHeight);
        
        Human shubh = new Human("Shubh",6);
        System.out.println(Human.maxHumanHeight);

        Human nandeesh = new Human("Nandeesh",5.10f);
        System.out.println(Human.maxHumanHeight);
        
        Human achint = new Human("Achint",6);
        System.out.println(Human.maxHumanHeight);
        
        Human aswal = new Human("Aswal",5.6f);
        System.out.println(Human.maxHumanHeight);
        

    }

}
