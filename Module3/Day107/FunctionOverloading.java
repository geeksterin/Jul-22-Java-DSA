import java.util.*;

public class FunctionOverloading {

    public static int add(int a, int b ) {
        return a+b;
    } 

    public static int add(int a, int b, int x ) {
        return a+b + x;
    }

    public static int add(int[] nums) {
        int sum = 0;
        for ( int i:nums ) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        System.out.println("\n");

        System.out.println("add(1,2) : " + add(1,2));
        System.out.println("add(1,2,10) : " + add(1,2,10));

        int[] arr = {1,2,3,4,5};
        
        System.out.println("add({1,2,3,4,5}) : " + add(arr));

        System.out.println("\n");
    }

}