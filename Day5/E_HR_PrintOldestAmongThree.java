import java.io.*;
import java.util.*;

public class E_HR_PrintOldestAmongThree {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if ( a>b ) {
            if ( a>c ) {
                System.out.println("A");
            }
        }
        if ( b>a ) {
            if ( b>c ) {
                System.out.println("B");
            }
        }
        if ( c>a ) {
            if ( c>b ) {
                System.out.println("C");
            }
        }
        
        
    }
}