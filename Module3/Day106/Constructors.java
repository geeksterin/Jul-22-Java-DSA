import java.util.*;

public class Constructors {

    public static class Hero {

        int strength;
        int level;
        ArrayList<String> weapons = new ArrayList<String>();
        String defaultWeapon;
    
        // 1. NO-ARGS CONSTRUCTOR
        Hero() {
            strength = 100;
            level = 1;
            weapons = new ArrayList<String>();
            defaultWeapon = "NO_WEAPON";
        } 
        
    }

    public static void main(String[] args) {
        
        System.out.println("\n");

        Hero kratos = new Hero();

        System.out.println("Strength: " + kratos.strength);
        System.out.println("Level   : " + kratos.level);
        System.out.println("Weapons : " + kratos.weapons);
        System.out.println("Def Weap: " + kratos.defaultWeapon);

        
        System.out.println("\n");
    }

}