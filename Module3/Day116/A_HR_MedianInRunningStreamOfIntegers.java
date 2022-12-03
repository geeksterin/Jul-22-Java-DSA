import java.util.* ;
import java.io.* ;
class A_HR_MedianInRunningStreamOfIntegers {

    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Float> p1 = new PriorityQueue<Float>(); // first half
        PriorityQueue<Float> p2 = new PriorityQueue<Float>(Collections.reverseOrder()); // second half

        for ( int i = 0; i < n; i++ ) {

            float num = sc.nextInt();

            p1.add(num);

            if ( p1.size() - p2.size() > 1 ) {
                p2.add(p1.poll());
            }

            if ( p1.size()!=p2.size() )  {
                // ODD CASE
                // the only middle element.
                System.out.println(p1.peek());
            } else {
                // EVEN CASE
                // the two middle element.
                System.out.println((p1.peek()+p2.peek())/2.0);
            }


        }

    }

}
