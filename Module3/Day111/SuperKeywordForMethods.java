class Device {

    void func() {
        System.out.println("func of Display");
    }

}

class Phone extends Device {

    void func() {
        System.out.println("func of Phone");
    }

    void display(int x) {

        if ( x==1 ) {
            // call func of Phone class
            this.func();
        } else {
            // call func of Device class
            super.func();
        }

    }

}

public class SuperKeywordForMethods {

    public static void main(String[] args) {

        System.out.println("\n");
        
        Phone iphone = new Phone();
        
        iphone.display(1);
        iphone.display(2);

        System.out.println("\n");

    }

}