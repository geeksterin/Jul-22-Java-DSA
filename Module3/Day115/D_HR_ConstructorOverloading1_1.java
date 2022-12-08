import java.util.* ;
import java.io.* ;

class Movie {

    String name;
    Integer rating;
    Integer moneyCollection;
    Integer profit;
    String leadActor;
    String leadActress;

    Movie( int rating, int moneyCollection) { 
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        System.out.println("Stored rating and money.");
    }
    Movie( int rating, int moneyCollection, int profit) { 
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        System.out.println("Stored rating, money, profit are given.");
    }
    Movie( int rating, int moneyCollection, int profit, String leadActor) { 
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActor = leadActor;
        System.out.println("Stored rating, money, profit, lead actors are given.");
    }

}
class D_HR_ConstructorOverloading1_1 {

    public static void main( String args[] ) {

        Movie superman1 = new Movie(8, 900000);
        Movie superman2 = new Movie(8, 900000, 8000);
        Movie superman3 = new Movie(8, 900000, 8000, "Ranveer Singh");

    }

}
