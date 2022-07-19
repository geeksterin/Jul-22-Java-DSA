import java.io.*;
import java.util.*;

public class E_HR_AreaAndPerimeter5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int length, breadth;
        length  = sc.nextInt();
        breadth = sc.nextInt();
        
        int area, perimeter;
        area = length * breadth;
        perimeter = 2 * (length+breadth);
        
        System.out.println(area);
        System.out.println(perimeter);
        
        
    }
}