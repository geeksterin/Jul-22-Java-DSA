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

    public static void printLL(Node head) {
        while ( head!=null ) {
            System.out.print(head.data + ", ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main1( String args[] ) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null; // initially ll is blank/empty.

        while( n-- >= 0 ) {

            int num = sc.nextInt();
            
            // we have to insert/add this num to LL's end

            if ( head == null ) {
                // CASE: LL is EMPTY
                head = new Node(num);
                continue;
            }

            Node temp = head;
            while ( temp.next!=null ) {
                temp = temp.next;
            }
            // now temp.next is null
            // meaning there is no node after this point
            // or in other words temp is standing at LAST node of LL.

            temp.next = new Node(num);

            printLL(head);
        }

    }
    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null; // initially ll is blank/empty.

        while( n-- != 0 ) {

            int num = sc.nextInt();
            
            // we have to insert/add this num to LL's end

            if ( head == null ) {
                // CASE: LL is EMPTY
                head = new Node(num);
            } else {
                // CASE: LL is NOT EMPTY
                Node temp = head;
                while ( temp.next!=null ) {
                    temp = temp.next;
                }
                // now temp.next is null
                // meaning there is no node after this point
                // or in other words temp is standing at LAST node of LL.

                temp.next = new Node(num);
            }
            // NUM IS INSERTED
            printLL(head);
        }

    }

}
