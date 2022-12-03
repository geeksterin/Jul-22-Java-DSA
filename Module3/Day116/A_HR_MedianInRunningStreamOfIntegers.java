import java.util.* ;
import java.io.* ;
class A_HR_MedianInRunningStreamOfIntegers {

    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Float> p1 = new PriorityQueue<Float>(Collections.reverseOrder()); // first half
        PriorityQueue<Float> p2 = new PriorityQueue<Float>(); // second half

        for ( int i = 0; i < n; i++ ) {

            float num = sc.nextInt();

            if ( !p1.isEmpty() && num > p1.peek() ) {
                p2.add(num);
            } else {
                p1.add(num);
            }


            if ( p1.size() - p2.size() > 1 ) {
                p2.add(p1.poll());
            } else if ( p2.size() - p1.size() > 1 ) {
                p1.add(p2.poll());
            }

            if ( p1.size()!=p2.size() )  {
                // ODD CASE
                // the only middle element.
                if ( p1.size()>p2.size() ) {
                    System.out.println(p1.peek());
                } else {
                    System.out.println(p2.peek());
                }
            } else {
                // EVEN CASE
                // the two middle element.
                System.out.println((p1.peek()+p2.peek())/2.0);
            }

            System.out.println(p1);
            System.out.println(p2);
            System.out.println("---------------------------------");


        }

    }

}
