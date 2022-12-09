import java.util.* ;
import java.io.* ;

class Human {

    static {
        System.out.println("static");
    }
    
    {
        System.out.println("instance");
    }

    Human() {
        System.out.println("constructor");
    }

}

class D_StaticAndInstanceBlock {

    public static void main( String args[] ) {
        
        Human shubh = new Human();
        Human shubh1 = new Human();

    }

}
