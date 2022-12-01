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

class MovieChild extends Movie {

    MovieChild(String name, Integer rating, Integer moneyCollection, Integer profit, String leadActor, String leadActress) {
        super(name, rating, moneyCollection, profit, leadActor, leadActress);
    }

    void propDisplay() {
        System.out.println(this.getName());
        System.out.println(this.getRating());
        System.out.println(this.getMoneyCollection());
        System.out.println(this.getProfit());
        System.out.println(this.getLeadActor());
        System.out.println(this.getLeadActress());
    }

}

class C_HR_Methods2_2 {

    public static void main( String args[] ) {

        MovieChild batman  = new MovieChild( 
            "Batman 1",
             8,
              200000,
               5000,
                "Rachel Gupta & Nikhil Chinapa",
                 "Disha"
                 );
        batman.propDisplay();
    }

}
