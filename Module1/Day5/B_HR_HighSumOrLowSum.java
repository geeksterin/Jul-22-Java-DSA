import java.io.*;
import java.util.*;

public class B_HR_HighSumOrLowSum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        
        if ( x+y >= 100 ) {
            System.out.println("High Sum");
        } 
        else {
            System.out.println("Low Sum");
        }
        
        
    }
}