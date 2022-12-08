import java.util.* ;
import java.io.* ;

class Movie {

    String name;
    Integer rating;
    Integer money;
    Integer profit;
    String leadActor;
    String leadActress;

    Movie(int rating, int money) {
        this.rating = rating;
        this.money = money;
        System.out.println("Stored rating and money");
    }

    Movie(int rating, int money, int profit) {
        this.rating = rating;
        this.money = money;
        this.profit = profit;
        System.out.println("Stored rating, money, profit are given.");
    }

    Movie(int rating, int money, int profit, String leadActor) {
        this.rating = rating;
        this.money = money;
        this.profit = profit;
        this.leadActor = leadActor;
        System.out.println("Stored rating, money, profit, lead actors are given.");
    }

}

class F_HR_ConstructorOverloading1_1 {

    public static void main( String args[] ) {

        Movie batman1 = new Movie(8,900000);
        Movie batman2 = new Movie(8,900000, 8000);
        Movie batman3 = new Movie(8,900000, 8000, "Ranveer Singh");
        
    }

}
