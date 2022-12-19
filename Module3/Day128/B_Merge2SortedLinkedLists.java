import java.util.* ;
import java.io.* ;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class B_Merge2SortedLinkedLists {

    public static Node merge( Node head1, Node head2) {

        Node head = new Node(0);
        Node tail = head;

        while ( head1!=null && head2!=null ) {
            // we can compare
            if ( head1.data < head2.data ) {
                // add head1 node after tail
                tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
                tail.next = null;
            } else {
                tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
                tail.next = null;
            }
        }
        // either head1 is left, or head2 is left

        if ( head1==null ) {
            tail.next = head2;
        } else if ( head2==null) {
            tail.next = head1;
        }

        return head.next;

    }

    public static void printLL(Node head) {
        if ( head == null ) {
            System.out.println("EMPTY LL :P");
            return;
        }

        while ( head!=null ) {
            System.out.print(head.data + ", ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        Node head1 = null, head2 = null, tail = null;
        
        int n = sc.nextInt();
        for ( int i = 0 ; i < n ; i++ ) {
            int num = sc.nextInt();
            if ( head1==null ) {
                head1 = new Node(num);
                tail = head1;
            } else {
                tail.next = new Node(num);
                tail = tail.next;
            }
        }
        
        int m = sc.nextInt();
        for ( int i = 0 ; i < m ; i++ ) {
            int num = sc.nextInt();
            if ( head2==null ) {
                head2 = new Node(num);
                tail = head2;
            } else {
                tail.next = new Node(num);
                tail = tail.next;
            }
        }

        printLL(head1);
        printLL(head2);
        Node merged = merge(head1, head2);
        printLL(merged);


    }

}
