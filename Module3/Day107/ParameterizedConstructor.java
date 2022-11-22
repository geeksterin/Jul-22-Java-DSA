import java.util.*;

public class ParameterizedConstructor {

    public static class Hero {

        int strength;
        int level;
        ArrayList<String> weapons;
        String defaultWeapon;
    
        // 1. NO-ARGS CONSTRUCTOR
        Hero() {
            strength = 100;
            level = 1;
            weapons = new ArrayList<String>();
            defaultWeapon = "NO_WEAPON";
        } 

        // 2. Parameterized Constructor
        Hero( int initialStrength, int initialLevel, ArrayList<String> initalWeapons, String initialDefaultWeapon) {

            strength = initialStrength;
            level = initialLevel;
            weapons = initalWeapons;
            defaultWeapon = initialDefaultWeapon;

        }
        
    }

    public static void main(String[] args) {
        
        System.out.println("\n");


        Hero kratos = new Hero();

        System.out.println("Kratos Strength: " + kratos.strength);
        System.out.println("Kratos Level   : " + kratos.level);
        System.out.println("Kratos Weapons : " + kratos.weapons);
        System.out.println("Kratos Def Weap: " + kratos.defaultWeapon);


        System.out.println("\n---------------------------------------\n");


        ArrayList<String> atreusWeapons = new ArrayList<String>();
        atreusWeapons.add("Pen");
        Hero atreus = new Hero( 1000, 10, atreusWeapons, "Pen" );

        System.out.println("Atreus Strength: " + atreus.strength);
        System.out.println("Atreus Level   : " + atreus.level);
        System.out.println("Atreus Weapons : " + atreus.weapons);
        System.out.println("Atreus Def Weap: " + atreus.defaultWeapon);


        System.out.println("\n");
    }

}