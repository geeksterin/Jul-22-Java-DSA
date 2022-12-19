import java.util.* ;
import java.io.* ;

class A_nTo0EvenRecursion {

    public static void printNto0Even( int n ) {
        
        if ( n<0 ) {
            return;
        }

        // n == 6 / EVEN
        // System.out.println(n - (n&1)); res->6->n-0
        
        // n == 7 / ODD
        // System.out.println(n - (n&1)); res->6->n-1
        
        System.out.println(n - (n&1));
        printNto0Even(n-2);
        
    }

    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNto0Even(num);

    }

}
