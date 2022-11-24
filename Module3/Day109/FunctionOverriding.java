import java.util.*;

public class FunctionOverriding {
    
    public static class Rectangle {

        int length, breadth;

        float getArea() {
            return this.length*this.breadth;
        }
        float getPerimeter() {
            return 2*(this.length+this.breadth);
        }

    }

    // rectangle DIRECTLY inherited in square
    // polygon INDIRECTLY iinherited in square via rectangle
    public static class Square extends Rectangle {

        int side;

        float getArea() {
            return this.side*this.side;
        }
        float getPerimeter() {
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
