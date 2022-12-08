
class Movie {
    String name, leadActor, leadActress;
    int rating, money, profit;

    Movie( String name, Integer rating, Integer money, Integer profit, String leadActor, String leadActress) { 
        this.name = name;
        this.rating = rating;
        this.money = money;
        this.profit = profit;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
    }

}

public class A_HR_Constructors1_1 {

    public static void movieChalao(Movie movie) {
        System.out.println(movie.rating);
        System.out.println(movie.money);
        System.out.println(movie.profit);
        System.out.println(movie.leadActor);
        System.out.println(movie.leadActress);
    }


    public static void main(String[] args) {

        Movie batman4 = new Movie(
            "Batman 4",
            9,
            700000,
            9000,
            "Jack",
            "Alia"
        );

        movieChalao(batman4);
        // batman4.movieChalao();
    }    

}
