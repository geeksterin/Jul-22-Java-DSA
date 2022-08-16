import java.io.*;
import java.util.*;

public class F_HR_FahrenheitAndCelsius {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
     
        double tf, tc;
        tf = sc.nextDouble();
        tc = ( (tf - 32) * 5 ) / 9.0;
        System.out.println(tc);
        
        
    }
}