import java.util.* ;
import java.io.* ;

class B_IdentifyDuplicateInAnArrayOfUniques {

    public static int findDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for ( int i:arr )
            if ( !set.add(i) )
                return i;
        // no duplicate found
        return -1;
    }

    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int i = 0; i < n; i++ )
            arr[i] = sc.nextInt();
        System.out.println(findDuplicate(arr));

    }

}
