import java.io.*;
import java.util.*;

public class D_HR_ShopDiscount {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int units, cost;
        
        units = sc.nextInt();
        
        cost = 100 * units;
        
        if ( cost > 1000 ) {
            int discount = (10 * cost) / 100;
            cost = cost - discount;
        }
        
        System.out.println(cost);
        
    }
}