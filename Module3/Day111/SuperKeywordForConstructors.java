class Rectangle {

    int area, perimeter;

    Rectangle( int length, int breadth) {
        this.area = length*breadth;
        this.perimeter = 2*(length+breadth);
    }

}

class Square extends Rectangle {

    int side;
    
    Square(int side) {
        // to ur parents paramtereized constructor
        super(side, side);
        this.side = side;
    }

}

public class SuperKeywordForConstructors {

    public static void main(String[] args) {

        System.out.println("\n");
        
        Rectangle sq = new Square(5);
        
        // Significance of Upcasting
        // Polygon p1 = new Triangle();
        // Polygon p2 = new Square();
        // Polygon p3 = new Circle();

        System.out.println("Area: "+sq.area);
        System.out.println("Peri: "+sq.perimeter);

        System.out.println("\n");

    }

}