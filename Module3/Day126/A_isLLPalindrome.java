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

class A_isLLPalindrome {

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

    public static Node reverseLL(Node head) {

        Node temp = head; 
        Node next = null;
        Node prev = null;

        while ( temp != null ) {
            // first of all safely store the next node temp will be going to
            next = temp.next;
            // time to change the arrow direction
            temp.next = prev;
            // update prev and temp to the deserving nodes.
            prev = temp;
            temp = next;
        }
        return prev;

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

    public static boolean isLLPalindrome(Node head) {

        Node midNode = findMid(head);
        Node newHead = reverseLL(midNode);

        Node t1 = head, t2 = newHead;

        while ( t1!=null && t2!=null ) {
            if ( t1.data != t2.data ) {
                // not a palindrome
                return false;
            }
            t1 = t1.next;
            t2 = t2.next;
        }

        // loop is over
        // no pair of nodes found with mimatched values
        // ll is a palindrome
        return true;

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

        System.out.println(isLLPalindrome(head));

        System.out.println("\n");

    }

}
