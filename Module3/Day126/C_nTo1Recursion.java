import java.util.* ;
import java.io.* ;

class C_nTo1Recursion {

    public static void printNto1( int n ) {
        
        if ( n==0 ) {
            return;
        }

        System.out.println(n);
        printNto1(n-1);
        
    }

    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNto1(num);

    }

}
