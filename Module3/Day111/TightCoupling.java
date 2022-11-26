class Rectangle {

    int area, perimeter;

    Rectangle(int length, int breadth) {
        this.area = length*breadth;
        this.perimeter = 2*(length+breadth);
    }

}

class Rectangle_DO_NOT_INHERIT {

    int length, breadth;

    Rectangle_DO_NOT_INHERIT( int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int[] getAreaAndPerimeter() {
        int[] x = {length*breadth, 2*(length+breadth)};
        return x;
    }

}

class Square extends Rectangle {

    int side;
    
    Square(int side) {
        // to ur parents paramtereized constructor
        super(side, side);
        this.side = side;
    }

    int getArea() {
        return this.area;
    }
    int getPerimeter() {
        return this.perimeter;
    }
}

public class TightCoupling {

    public static void main(String[] args) {

        System.out.println("\n");
        
        Square sq = new Square(5);
        System.out.println("Area: "+sq.getArea());
        System.out.println("Peri: "+sq.getPerimeter());

        System.out.println("\n");

    }

}