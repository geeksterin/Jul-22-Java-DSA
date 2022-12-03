import java.util.* ;
import java.io.* ;
class A_HR_MedianInRunningStreamOfIntegers {

    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for ( int i = 0; i < k; i++ ) {

            int n = sc.nextInt();
            while ( n--!=0 ) {
                arr.add(sc.nextInt());
            }
        }

        Collections.sort(arr);

        for ( Integer i:arr ) {
            System.out.print(i+" ");
        }

    }

}
