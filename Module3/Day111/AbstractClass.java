abstract class Shape {

    abstract float getArea();
    abstract float getPerimeter();
    void display() {
        System.out.println("Its a abstract class shape");
    }
    void someVeryUsefulFunction() {
        System.out.println("The treasure chest is under a big W in Goa");
    }

}

class Square extends Shape {

    int side;
    Square(int side){
        this.side = side;
    }    
    float getArea() {
        return side*side;
    }
    float getPerimeter() {
        return side*4;
    }

}

class Circle extends Shape {

    int radius;
    Circle(int radius){
        this.radius = radius;
    }    
    float getArea() {
        return 3.14f*radius*radius;
    }
    float getPerimeter() {
        return 2*radius*3.14f;
    }

}

public class AbstractClass {

    public static void main(String[] args) {

        System.out.println("\n");
        
        // Shape sh = new Shape();
        // sh.getArea();
        // HENCE CANNOT INSTANTIATE ABSTRACT CLASSES

        Shape sq = new Square(5);
        Shape circle = new Circle(5); 

        // DO YOU REMEMBER
        // List<Integer> = new ArrayList<Integer>();
        // List<Integer> = new LinkedList<Integer>();

        System.out.println("Area of Sq: "+sq.getArea());
        System.out.println("Peri of Sq: "+sq.getPerimeter());
        System.out.println("Area of Circle: "+circle.getArea());
        System.out.println("Peri of Circle: "+circle.getPerimeter());


        System.out.println("\n");

    }

}