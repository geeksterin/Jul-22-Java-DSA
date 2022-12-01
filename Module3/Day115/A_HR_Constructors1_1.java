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

class Solution {

    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);

        Movie batman  = new Movie( "Batman", 9, 700000, 9000, "Jack", "Alia");

        System.out.println(batman.getRating());
        System.out.println(batman.getMoneyCollection());
        System.out.println(batman.getProfit());
        System.out.println(batman.getLeadActor());
        System.out.println(batman.getLeadActress());

    }

}