import java.util.*;

public class MultiLevelInheritance {
    
    public static class Polygon {

        int noOfEdges;
        float area, perimeter;
        
        Polygon() {
            System.out.println("Constructor of Polygon called");
        }

        int getNoOfEdges() { 
            return this.noOfEdges;
        }

    }

    public static class Rectangle extends Polygon {

        int length, breadth;

        Rectangle() {
            System.out.println("Constructor of Rectangle called");
            this.noOfEdges = 4;
        }
        float getArea() {
            this.area = this.length*this.breadth;
            return this.area;
        }
        float getPerimeter() {
            this.perimeter = 2*(this.length+this.breadth);
            return this.perimeter;
        }

    }

    // rectangle DIRECTLY inherited in square
    // polygon INDIRECTLY iinherited in square via rectangle
    public static class Square extends Rectangle {

        Square(int side) {
            System.out.println(":--> Constructor of Square called");
            this.length = side;
            this.breadth = this.length;
        }
        int getSide() {
            return this.length;
        }
        void setSide(int side) {
            this.length = side;
            this.breadth = this.length;
        }

    }

    public static void main(String[] args) {

        Square sq = new Square(5);
        System.out.println("Edges: "+sq.getNoOfEdges());
        System.out.println("Area : "+sq.getArea());
        System.out.println("Side : "+sq.getSide());

    }

}
