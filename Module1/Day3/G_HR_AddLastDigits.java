import java.io.*;
import java.util.*;

public class G_HR_AddLastDigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        System.out.println((num1%10) + (num2%10));
        
        
    }
}