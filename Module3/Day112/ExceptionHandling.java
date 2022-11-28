import java.util.*;
import java.lang.*;

// SYNTAX

// try {

//     // CODE

// } catch (Exception e) {

//     // WHAT HAPPENS WHEN THIS Excpeion is Thrown

// }
// ...
// [finally {

//     // CODE HERE WILL DEFINITLY RUN

// }]

public class ExceptionHandling {

    public static void main(String[] args) {

        System.out.println("\n");
        
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // System.out.println(num1/num2);

        try {  
            System.out.println(num1/num2);
        } catch ( ArithmeticException e ) {
            System.out.println("Denominator was 0");
        } finally {
            System.out.println("Program Ends!!");
        }

        System.out.println("\n");

    }

}