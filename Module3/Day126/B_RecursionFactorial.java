import java.util.* ;
import java.io.* ;

class B_RecursionFactorial {

    public static long factorial( int num ) {
        
        // Space -> O(n)
        // Time -> O(n)

        // Base Case
        if ( num == 1 ) {
            return 1l;
        }
        
        // Recursive Case
        return num * factorial( num-1 );
        
    }

    public static long factorial2( int num ) {

        if ( num != 1 ) {
            return num * factorial2( num-1 );
        }
        return 1l;
    }

    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            System.out.println(num+"! = "+120);
        }

    }

}
