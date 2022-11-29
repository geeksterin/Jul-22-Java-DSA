import java.util.* ;
import java.io.* ;

class LEET1464 {

    public static int solve1(int[] arr) {
        // sorting the array
        // O(nlogn)
        return 10;
    }

    public static int solve2(int[] arr) {
        // using PQ of only size 2
        
        // O(n)

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(arr[0]);
        pq.add(arr[1]);

        // n traversals
        for ( int i = 2; i < arr.length; i++) { 

            // O(log2) = O(1)
            pq.add( Math.max( arr[i], pq.poll() ) );
        }

        return (pq.poll()-1)*(pq.poll()-1);

    }

    public static int solve3(int[] arr) {
        // find max & second max
        
        // O(n)

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for ( int i:arr ) {
            if ( i>max ) {
                secMax = max;
                max = i;
            } else if ( i>secMax && i<max ) {
                secMax = i;
            }
        }
        return (secMax-1) * (max-1);

    }


    public static void main( String args[] ) throws FileNotFoundException {

        System.setIn( new FileInputStream( new File("input.txt") ) ) ;
        System.setOut( new PrintStream( new File("output.txt") ) ) ;

        Scanner in = new Scanner(System.in) ;
 
        int t = in.nextInt() ;

        while ( t-- != 0 ) {

            int n = in.nextInt() ;
            int[] arr = new int[n];
            for ( int i = 0 ; i < n ; i++ ) {
                arr[i] = in.nextInt() ;
            }

            System.out.println((solve3(arr)));

        }

    }

}