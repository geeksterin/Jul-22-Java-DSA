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

class C_FindKthFromLast {

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

    public static Node kthFromLast(Node head, int k) {

        int size = size(head);
        Node temp = head;
        for ( int i = 0 ; i < size-k ; i++ ) {
            temp = temp.next;
        }
        return temp;

    }

    public static Node kthFromLastEfficient(Node head, int k) {

        Node aage = head;
        Node peeche = head;

        for ( int i = 0 ; i < k ; i++ ) {
            aage = aage.next;
        }

        // now aage has a HEADSTART of k moves

        while ( aage!=null ) {
            aage = aage.next;
            peeche = peeche.next;
        }

        // aage has reached null
        // peeche is now left with the HEADSTART distance
        // peeche is standing at kth node but from END.
        return peeche;

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

        int k = sc.nextInt();
        Node node = kthFromLastEfficient(head,k);
        System.out.println(node.data);

        System.out.println("\n");

    }

}
