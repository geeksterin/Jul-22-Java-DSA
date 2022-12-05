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

    int views, likes;

    CommercialMovie(String name, Integer rating, Integer moneyCollection, Integer profit, String leadActor, String leadActress, int views, int likes) {
        super(name, rating, moneyCollection, profit, leadActor, leadActress);
        this.views = views;
        this.likes = likes;
    }

    void displayRating() {
        // System.out.println(this.rating);
        System.out.println("This is the function of the commercial movies class.");
    }

}


class CreativeMovie extends Movie {

    int views, likes;

    CreativeMovie(String name, Integer rating, Integer moneyCollection, Integer profit, String leadActor, String leadActress, int views, int likes) {
        super(name, rating, moneyCollection, profit, leadActor, leadActress);
        this.views = views;
        this.likes = likes;
    }

    void displayRating() {
        // System.out.println(this.rating);
        System.out.println("Inside the creativeMovies class");
    }

}

class C_HR_Overriding1_3 {

    public static void main( String args[] ) {

        CommercialMovie londonDreams = new CommercialMovie(
            "London Dreams 2",
            10,
            9000,
            8850,
            "Rannvijay Singha, Rachel Gupta, Prince Narula",
            "Prajakta",
            10000,
            500
        );

        CreativeMovie andhadhun = new CreativeMovie(
                            "Andhadhun",
                            10,
                            7000000,
                            800000,
                            "Ayushman Khurana",
                            "Disha",
                            20000,
                            400
        );

        londonDreams.displayRating();
        andhadhun.displayRating();

    }

}
