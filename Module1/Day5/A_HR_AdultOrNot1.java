import java.io.*;
import java.util.*;

public class A_HR_AdultOrNot1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int age;
        age = sc.nextInt();
        
        if ( age >= 18 ) {
            System.out.println("Adult");
        } 
        else {
            System.out.println("Below age");
        }
        
    }
}