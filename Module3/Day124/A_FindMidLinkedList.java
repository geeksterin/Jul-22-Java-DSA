import java.util.* ;

import javax.swing.plaf.synth.SynthStyleFactory;

import java.io.* ;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class A_FindMidLinkedList {

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

    public static Node findMid(Node head) {

        int n = size(head);
        Node temp = head;
        for ( int i = 0 ; i<n/2 - (n&1^1) ; i++ ) {
            temp = temp.next;
        }
        return temp;

    }

    public static Node findMidEfficient(Node head) {

        Node slow = head;
        Node fast = head.next;

        while ( fast!=null && fast.next!=null )  {
        // while ( fast.next!=null && fast.next.next!=null )  {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

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
        System.out.println("--------------------------------\n");
        // ----------------------------------------------------------------

        // Node mid = findMid(head);
        Node mid = findMidEfficient(head);
        System.out.println("Middle -> " + mid.data);

    }

}
