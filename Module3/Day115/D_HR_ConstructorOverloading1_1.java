import java.util.* ;
import java.io.* ;

class Movie {

    private String name;
    private Integer rating;
    private Integer moneyCollection;
    private Integer profit;
    private String leadActor;
    private String leadActress;

    Movie() {
        this.name = "NEW_MOVIE";
        this.rating = 0;
        this.moneyCollection = 0;
        this.profit = 0;
        this.leadActor = "ACTOR";
        this.leadActress = "ACTRESS";
    }

    Movie(String name, Integer rating, Integer moneyCollection, Integer profit, String leadActor, String leadActress) {
        this.name = name;
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
    }

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

    String getName() {
        return this.name;
    }
    int getRating() {
        return this.rating;
    }
    int getMoneyCollection() {
        return this.moneyCollection;
    }
    int getProfit() {
        return this.profit;
    }
    String getLeadActor() {
        return this.leadActor;
    }
    String getLeadActress() {
        return this.leadActress;
    }

    void setName(String name) { this.name = name; }
    void setLeadActress(String leadActress) { this.leadActress = leadActress; }
    void setLeadActor(String leadActor) { this.leadActor = leadActor;}
    void setProfit(int profit) { this.profit = profit; }
    void setMoneyCollection(int moneyCollection) { this.moneyCollection = moneyCollection; }
    void setRating(int rating) { this.rating = rating;}

}
class D_HR_ConstructorOverloading1_1 {

    public static void main( String args[] ) {

        Movie superman1 = new Movie(8, 900000);
        Movie superman2 = new Movie(8, 900000, 8000);
        Movie superman3 = new Movie(8, 900000, 8000, "Ranveer Singh");

    }

}
