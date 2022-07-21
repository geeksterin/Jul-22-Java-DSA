import java.io.*;
import java.util.*;

public class B_PrintFinalZ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x,y,z;
        
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        
        if ( x>=20 ) {
            if ( y>=100 ) {
                z = z+100;
            }
            else if ( y>=50 ) {
                z = z+50;
            } 
            else {
                z = z+10;
            }
        } 
        else {
            if ( y>=100 ) {
                z = z+3;
            } 
            else if ( y>=50 ) {
                z = z+2;
            }
            else {
                z = z+1;
            }
        } 
        
        System.out.println(z);
        
    }
}