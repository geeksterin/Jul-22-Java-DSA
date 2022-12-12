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

class B_OperationsOnLinkedList {

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

    public static Node addToFront(Node head, int num) {
        Node newHead = new Node(num);
        newHead.next = head;
        head = newHead;
        return head;
    }

    public static Node addAtIndexK(Node head, int num, int k) {

        if ( k==0 ) {
            return addToFront(head,num);
        }

        Node temp = head;
        for ( int i = 0 ; i < k-1 ; i++) {
            temp = temp.next;
        }
        // now temp is standing just before kth index

        Node newNode = new Node(num);
        newNode.next = temp.next;
        temp.next = newNode;

        return head;

    }

    public static Node removeLastNode(Node head) {

        if ( head==null || head.next == null ) {
            // LL size is 0 or 1.
            return null;
        }

        Node temp = head;
        while ( temp.next.next != null ) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null; 
        while( n-- != 0 ) {
            int num = sc.nextInt();
            if ( head == null ) {
                head = new Node(num);
            } else {
                Node temp = head;
                while ( temp.next!=null ) {
                    temp = temp.next;
                }
                temp.next = new Node(num);
            }
        }

        System.out.print("OG LL :-> ");
        printLL(head);
        // ----------------------------------------------------------------

        // head = addToFront(head,100);
        // head = addAtIndexK(head,100,0);
        head = removeLastNode(head);
        printLL(head);

    }

}
