import java.util.*;
import java.lang.*;

public class TypesOfExceptions {

    public static void main(String[] args) {

        System.out.println("\n");
        
        Scanner sc = new Scanner(System.in);

        try {  
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1/num2);
            int[] arr = new int[num1];
            System.out.println(arr[100]);
            String s=null;

            // code works perfectly
            System.out.println("Before line 38");
            System.out.println(s.length());
            System.out.println("After line 38");
            // code will not work
            // func(); // dosent exist
            // x = 6; // x dosent exist
        } 
        
        catch ( ArithmeticException e ) {
            System.out.println("Denominator was 0");
        } catch ( NullPointerException e ) {
            System.out.println("(_/:-:\\_)");
        } catch ( InputMismatchException e ) {
            System.out.println("So you don;t know what's a number, huh!");
        } catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println("Array ki hadd em raho!!");
        } 
        
        catch ( Exception e ) {
            System.out.println("Unexpected Error!!");
            System.out.println("--------------------------------");
            System.out.println(e);
            System.out.println("--------------------------------");
            e.printStackTrace();
        }
        
        finally {
            System.out.println("Program Ends!!");
        }
        System.out.println("\n");

    }

}