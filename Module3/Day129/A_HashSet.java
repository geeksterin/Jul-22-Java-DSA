import java.util.* ;
import java.io.* ;

class A_HashSet {

    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        while (q--!=0) {
            int qt = sc.nextInt();
            if ( qt == 1) {
                // add a num to set
                int num = sc.nextInt();
                System.out.println("Add operation success ?:  " + set.add(num));
                System.out.println(set);
            } else if ( qt == 2 ) {
                // search for element
                int num = sc.nextInt();
                System.out.println(set.contains(num));
            } else {
                // remove the element
                int num = sc.nextInt();
                System.out.println("Remove operation success ?:  " + set.remove(num));
                System.out.println(set);
            }
        }

        // for ( Integer i:set ) {
        //     System.out.println(i);
        // }

        System.out.println("\n");

    }

}
