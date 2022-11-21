import java.util.*;

public class Game {

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

        int increaseHealth(int quantity) {
            strength += quantity;
            return strength;
        }
        void foundTreasureChest(char type) {
            if ( type=='G' ) {
                level += 10;
            } else if ( type=='R' ) {
                level += 100;
            } else {
                level = 0; //  #DEAD
            }
        }
        int addWeapon(String weaponName) {

            Scanner sc = new Scanner(System.in);

            weapons.add(weaponName);
            System.out.println("Make this weapon Default ?(y/n): ");
            char choice  = sc.next().charAt(0);
            if ( choice == 'y' ) {
                defaultWeapon = weaponName;
            }
            return weapons.size();

        }
        boolean changeDefaultWeapon(String weaponName) {
            // first check if we really ihave this weapon unlocked or not
            boolean hasWeapon = weapons.contains(weaponName);
            if ( hasWeapon ) {
                defaultWeapon = weaponName;
            } 
            return hasWeapon;
        }

        // boolean changeDefaultWeapon(String weaponName) {

        //     // first check if we really ihave this weapon unlocked or not
        //     if ( weapons.contains(weaponName) ) {
        //         defaultWeapon = weaponName;
        //     } else {
        //         return false;
        //     }
        //     return true;

        // }

    }

    public static void main(String[] args) {
        
        System.out.println("\n");

        Hero kratos = new Hero();

        int newHealth = kratos.increaseHealth(500);
        System.out.println("Health increased to "+newHealth);
        System.out.println("Verified by "+kratos.strength);

        // ----------------------------------------------------------------

        kratos.increaseHealth(400);
        System.out.println("Value after second call "+newHealth); 
        System.out.println("Latest Kratos strength by "+kratos.strength);

        // ----------------------------------------------------------------

        // wepons

        kratos.addWeapon("Sword");
        kratos.addWeapon("Dagger");
        kratos.addWeapon("Anchor");

        boolean changeDefaultWeaponResult = kratos.changeDefaultWeapon("Gun");

        if ( changeDefaultWeaponResult ) {
            System.out.println("Changed default weapon to Gun");
        } else {
            System.out.println("Changed default weapon FAILED!!!");
        }

        System.out.println("Curent Default Weapon: " + kratos.defaultWeapon);
        kratos.changeDefaultWeapon("Dagger");
        System.out.println("Curent Default Weapon: " + kratos.defaultWeapon);

        System.out.println("\n");
    }

}