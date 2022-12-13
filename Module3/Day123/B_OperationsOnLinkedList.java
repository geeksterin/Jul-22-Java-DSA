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

    public static int size(Node head) {
        // O(n) - Linear
        int size = 0;
        while ( head != null ) {
            head = head.next;
            size++;
        }
        return size;
    }

    public static Node addToFront(Node head, int num) {
        // O(1)
        Node newHead = new Node(num);
        newHead.next = head;
        head = newHead;
        return head;
    }

    public static Node addAtIndexK(Node head, int num, int k) {
        // O(k) - Linear
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
        // O(n)
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

    public static Node removeHeadNode(Node head) {
        // O(1)
        return head.next;
    }

    public static Node removeKthNode(Node head, int k) {
        // O(k) - Linear
        if ( k==0 ) {
            return removeHeadNode(head);
        }

        Node temp = head;
        for ( int i = 0 ; i < k-1 ; i++ ) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null; 

        // O(n^2)
        while( n-- != 0 ) {
            int num = sc.nextInt();
            if ( head == null ) {
                head = new Node(num);
            } else {

                // ADDING/INSERTING TO LAST
                // O(n)
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
        // head = removeLastNode(head);
        head = removeHeadNode(head);

        printLL(head);

    }

}
