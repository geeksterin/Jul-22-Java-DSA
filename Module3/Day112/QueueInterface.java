interface Queue {    
    int capaity = 0;
    abstract void insert(int x);
    abstract void remove();
    abstract int get();
    abstract int size();   
}
class LinkedList implements Queue {

    int size = 0;
    final static String description = "This is a LL Queue";

    public void insert(int x) {
        System.out.println(x+" inserted in LL queue");
        this.size++;
        this.capaity = 7; // STATIC
    }
    public void remove() {
        System.out.println(" removed from LL queue");
        this.size--;
    }
    public int get() {
        System.out.println("Got the element in LL queue");
        return 1;
    }
    public int size() {
        System.out.println(this.size+" is the size of LL queue");
        return this.size;
    }

}
class PriorityQueue implements Queue {

    int size = 0;
    public void insert(int x) {
        System.out.println(x+" inserted in PQ");
        this.size++;
    }
    public void remove() {
        System.out.println(" removed from PQ");
        this.size--;
    }
    public int get() {
        System.out.println("Got the element in PQ");
        return 10;
    }
    public int size() {
        System.out.println(this.size+" is the size of PQ");
        return this.size;
    }

}

class Dequeue implements Queue {

    int size = 0;
    public void insert(int x) {
        System.out.println(x+" inserted in dequeue");
        this.size++;
    }
    public void remove() {
        System.out.println(" removed from dequeue");
        this.size--;
    }
    public int get() {
        System.out.println("Got the element in dequeue");
        return 100;
    }
    public int size() {
        System.out.println(this.size+" is the size of dequeue");
        return this.size;
    }

}

public class QueueInterface {

    public static void main(String[] args) {

        System.out.println("\n");
        
        Queue ll = new LinkedList();
        Queue pq = new PriorityQueue();
        Queue dq = new Dequeue();

        ll.insert(4);
        ll.size();
        ll.remove();

        System.out.println("----------------------------------------------\n");
        
        pq.insert(40);
        pq.size();
        pq.remove();

        System.out.println("----------------------------------------------\n");
        
        dq.insert(400);
        dq.size();
        dq.remove();

        System.out.println("\n");

    }

}