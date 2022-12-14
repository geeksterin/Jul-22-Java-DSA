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

class A_InsertToMidLinkedList {

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

        Node slow = head;
        Node fast = head.next;

        while ( fast!=null && fast.next!=null )  {
        // while ( fast.next!=null && fast.next.next!=null )  {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public static Node insertInMid(Node head, int num) {

        if ( head==null ) { //size0 
            return new Node(num);
        }

        Node midNode = findMid(head);
        Node newNode = new Node(num);
        newNode.next = midNode.next;
        midNode.next = newNode;
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

        head = insertInMid(head,100);
        printLL(head);

        System.out.println("\n");

    }

}
