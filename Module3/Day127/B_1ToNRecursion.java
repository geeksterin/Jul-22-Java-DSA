import java.util.* ;
import java.io.* ;

class B_1ToNRecursion {

    public static void OneToNRecursion( int val, int n ) {
        
        if ( val>n ) {
            return;
        }
        
        System.out.println(val);
        OneToNRecursion(val+1,n);
    }
    
    public static void OneToNRecursion2( int n ) {
        
        // System.out.println("Function call with n = " + n + "started");
        if ( n==0 ) {
            return;
        }
        
        OneToNRecursion2(n-1);
        System.out.println(n);
        // System.out.println("Function call with n = " + n + "ended");
        
    }

    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // OneToNRecursion(1,num);
        OneToNRecursion2(num);
    }

}
