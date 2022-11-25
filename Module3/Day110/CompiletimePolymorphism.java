import java.util.*;

public class CompiletimePolymorphism {
    
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

    }

    public static void main(String[] args) {

        Shape shape = new Shape();
        Square square = new Square(5);
        Circle circle = new Circle(10);
    
        System.out.println(shape.getPerimeter());
        System.out.println(square.getPerimeter());
        System.out.println(circle.getPerimeter());

    }

}
