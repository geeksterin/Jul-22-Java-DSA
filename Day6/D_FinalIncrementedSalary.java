import java.io.*;
import java.util.*;

public class D_FinalIncrementedSalary {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        
        if ( x>=59 && y>=10 ){
            System.out.println("X is greater than or equal to 59 and y is greater than or equal to 10");
        }
        else if ( x>=50 && y<10 ) {
            System.out.println("X is greater than or equal to 50 and y is less than 10");
        } 
        else {
            System.out.println("None of the condition matches");
        }
    }
}