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

class B_RemoveMidLinkedList {

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

    public static Node findJustPrevToMid(Node head) {

        Node slow = head;
        Node fast = head.next;
        Node prev = null;
        
        while ( fast!=null && fast.next!=null )  {
        // while ( fast.next!=null && fast.next.next!=null )  {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;

    }

    public static Node removeMid(Node head) {

        if ( head==null ) { // Size = 0
            return null;
        } else if ( head.next==null ) { // Size = 1
            return null;
        } else if ( head.next.next == null ) { // Size = 2
            return head.next;
        }

        Node prev = findJustPrevToMid(head);
        // prev.next is mid
        // prev.next = mid.next
        prev.next = prev.next.next;
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
        System.out.println("--------------------------------\n");
        // ----------------------------------------------------------------

        head = removeMid(head);
        printLL(head);

        System.out.println("\n");

    }

}
