class Rectangle {

    int length, breadth;

    final int getArea() {
        return this.length*this.breadth;
    }

}

class Square extends Rectangle {

    final int noOfSides = 4;
    int side;
    Square(int side) {
        this.side = side;
        this.length = side;
        this.breadth = side;
    }

    void setNoOfSides(int noOfSides) {
        // CANT REASSIGN A FINAL ATTROBUTE
        this.noOfSides = noOfSides;
    }

    // CANT OVERRIDE A FINAL METHOD
    int getArea() {
        return this.side * this.side;
    }

}

public class FinalKeyword {

    public static void main(String[] args) {

        System.out.println("\n");

    }

}