import java.util.*;

public class FunctionOverriding {
    
    public static class Rectangle {

        int length, breadth;

        float getArea() {
            System.out.println("getArea of Rect called.");
            return this.length*this.breadth;
        }
        float getPerimeter() {
            System.out.println("getPeri of Rect called.");
            return 2*(this.length+this.breadth);
        }

    }

    // rectangle DIRECTLY inherited in square
    // polygon INDIRECTLY iinherited in square via rectangle
    public static class Square extends Rectangle {

        int side;

        float getArea() {
            System.out.println("getArea of Sq called.");
            return this.side*this.side;
        }
        float getPerimeter() {
            System.out.println("getPeri of Sq called.");
            return 4*this.side;
        }

    }

    public static void main(String[] args) {

        Square sq = new Square();
        sq.side = 5;
        sq.length = 4;
        sq.breadth = 6;
        System.out.println("Area : "+sq.getArea());

    }

}
