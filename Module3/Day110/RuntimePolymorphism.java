import java.util.*;

public class RuntimePolymorphism {
    
    public static class Shape {

        float getArea() {
            System.out.println("getArea of Shape called.");
            return 100f;
        }
        float getPerimeter() {
            System.out.println("getPeri of Shape called.");
            return 100f;
        }

    }

    public static class Square extends Shape {

        int side;

        Square(int side) {
            this.side = side;
        }

        float getArea() {
            System.out.println("getArea of Sq called.");
            return this.side*this.side;
        }
        float getPerimeter() {
            System.out.println("getPeri of Sq called.");
            return 4*this.side;
        }

        int getSide() {
            return this.side;
        }

    }

    public static class Circle extends Shape {

        int radius;

        Circle(int radius) {
            this.radius = radius;
        }

        float getArea() {
            System.out.println("getArea of Circle called.");
            return 3.14f*this.radius*this.radius;
        }
        float getPerimeter() {
            System.out.println("getPeri of Circle called.");
            return 2*3.14f*this.radius;
        }

        int getRadius() {
            return this.radius;
        }

    }

    public static void main(String[] args) {

        // UPCASTING
        Shape shape = new Shape();
        Shape square = new Square(5);
        Shape circle = new Circle(10);
    
        System.out.println(shape.getPerimeter());
        System.out.println(square.getPerimeter());
        System.out.println(circle.getPerimeter());

        // System.out.println("Side  : "+square.getSide());
        // System.out.println("Radius: "+circle.getRadius());

    }

}
