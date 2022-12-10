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

class A_LinkedListCreation {

    public static void main( String args[] ) {
        
        // Create A Linkedlist
        Node head = new Node(1);
        head.next = new Node(2);
        (head.next).next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Traverse A LinkedList
        Node temp = head;
        while ( temp != null ) {
            System.out.println(temp + " : " + temp.data+" : "+temp.next);
            temp = temp.next;
        }


    }

}
