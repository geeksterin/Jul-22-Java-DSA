import java.util.* ;
import java.io.* ;

class C_1ToNOddRecursion {

    // public static void OneToNRecursion( int val, int n ) {
        
    //     if ( val>n ) {
    //         return;
    //     }
        
    //     System.out.println(val);
    //     OneToNRecursion(val+1,n);
    // }
    
    public static void OneToNRecursionOdd2( int n ) {
        
        if ( n<1 ) {
            return;
        }
        
        OneToNRecursionOdd2(n-2);
        System.out.println(n - (n&1^1));
        
    }

    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // OneToNRecursion(1,num);
        OneToNRecursionOdd2(num);
    }

}
