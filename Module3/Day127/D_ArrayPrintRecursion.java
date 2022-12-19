import java.util.* ;
import java.io.* ;

class D_ArrayPrintRecursion {

    public static void func( int[] arr, int idx ) {
        
        if ( idx==arr.length ) {
            return;
        }

        System.out.println(arr[idx]);
        func(arr,idx+1);
        
    }


    public static void funcReverse( int[] arr, int n ) {
        
        if ( n<0 ) {
            return;
        }

        System.out.println(arr[n]);
        funcReverse(arr,n-1);
        
    }
    
    public static void func2( int[] arr, int n ) {
        
        if ( n<0 ) {
            return;
        }

        func2(arr,n-1);
        System.out.println(arr[n]);
        
    }


    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int i = 0; i < n; i++ ) {
            arr[i] = sc.nextInt();
        }
        func(arr,0);
        System.out.println("--------------------------------");
        funcReverse(arr,arr.length-1);
        System.out.println("--------------------------------");
        func2(arr,arr.length-1);
    }

}
