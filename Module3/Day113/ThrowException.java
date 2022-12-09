import java.util.*;
import java.io.*;
import java.lang.*;

public class ThrowException {

    public static int divide(int num1, int num2) throws NullPointerException {

        if ( num2==0 ) {
            throw new NullPointerException("Division by zero");
            // throw new IOException("Division by zero");
        }
        return num1/num2;
    }

    public static void main(String[] args) {

        System.out.println("\n");
        
        try {
            divide(2,4);
            divide(4,0);
        } catch (Exception e) {
            System.out.println("Error occured");
            System.out.println(e);
        }

        System.out.println("\n");

    }

}