abstract class DataStructure {
    abstract void insert(int element);
}

abstract class List extends DataStructure {
    int size = 5;
    // NO ABSTRACT METHOD
}

class ArrayList extends List {
    int arrayCapacity=10;
    int[] arr;
    void insert(int element){
        super.size = 5;
        System.out.println("Inserted element in arraylist in O(N) time");
    }
}
class LinkedList extends List {
    int head=1234;
    void insert(int element){
        System.out.println("Inserted element in linkedlist in O(1) time");
    }
}
public class AbstractClasses {

    public static void main(String[] args) {

        System.out.println("\n");
        
        List l1 = new ArrayList();
        List l2 = new LinkedList();

        l1.insert(5);
        l2.insert(5);

        ArrayList arr = new ArrayList();
        LinkedList ll = new LinkedList();

        System.out.println("Pure ArrayList Capacity: " + arr.arrayCapacity);
        System.out.println("Pure LinkedList Head:   " + ll.head);

        // CANT DO
        // System.out.println("List ArrayList Capacity: " + l1.arrayCapacity);
        // System.out.println("List LinkedList Head:   " + l2.head);

        System.out.println("\n");

    }

}