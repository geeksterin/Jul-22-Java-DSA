import java.util.*;

public class C_HR_JavaStdinStdout2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        double numd;
        String str;
        
        num = sc.nextInt();
        numd = sc.nextDouble();
        sc.nextLine();
        str = sc.nextLine();
        
        System.out.println("String: " + str);
        System.out.println("Double: " + numd);
        System.out.println("Int: " + num);
        
        
    }
}