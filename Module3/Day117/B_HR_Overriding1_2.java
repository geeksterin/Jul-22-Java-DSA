import java.util.* ;
import java.io.* ;

class Movie {

    String name;
    Integer rating;
    Integer moneyCollection;
    Integer profit;
    String leadActor;
    String leadActress;

    Movie(String name, Integer rating, Integer moneyCollection, Integer profit, String leadActor, String leadActress) {
        this.name = name;
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
    }

    void displayRating() {
        System.out.println(this.rating);
        System.out.println("This is the function of movies class.");
    }

}

class CommercialMovie extends Movie {
    CommercialMovie(String name, Integer rating, Integer moneyCollection, Integer profit, String leadActor, String leadActress) {
        super(name, rating, moneyCollection, profit, leadActor, leadActress);
    }

    void displayRating() {
        System.out.println(this.rating);
        System.out.println("This is the function of commercial movies class.");
    }

}

class B_HR_Overriding1_2 {

    public static void main( String args[] ) {

        CommercialMovie londonDreams = new CommercialMovie(
            "London Dreams 2",
            10,
            9000,
            8850,
            "Rannvijay Singha, Rachel Gupta, Prince Narula",
            "Prajakta"
        );

        System.out.println(londonDreams.moneyCollection);
        System.out.println(londonDreams.profit);
        System.out.println(londonDreams.leadActor);
        londonDreams.displayRating();

    }

}
