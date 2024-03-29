import java.util.* ;

import Module3.Day115.Movie;

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

class A_HR_ClassesAndObjects1_1 {

    public static void main( String args[] ) {

        String[] input =
        {
        "batman 1",
        "8",
        "200000",
        "5000",
        "Rachel Gupta & Nikhil Chinapa",
        "Disha",
        "batman 2",
        "9",
        "500000",
        "8000",
        "Rannvijay Singha & Prince Narula",
        "Neha Dhupia",
        "batman 2",
        "10",
        "700000",
        "6000",
        "Rachel Gupta & Prince Narula",
        "Neha Dhupia"};

        Scanner sc = new Scanner(System.in);

        int n = 3;
        MovieChild[] movies = new MovieChild[n];
        // movies[0] -> null

        for ( int i = 0; i < n; i++ ) {

            String name = input[i*6 + 0];
            Integer rating = Integer.valueOf(input[i*6 + 1]);
            Integer moneyCollection = Integer.valueOf(input[i*6 + 2]);
            Integer profit = Integer.valueOf(input[i*6 + 3]);
            String leadActor = input[i*6 + 4];
            String leadActress = input[i*6 + 5];

            movies[i] = new MovieChild(
                name,
                rating,
                moneyCollection,
                profit,
                leadActor,
                leadActress
            );

        }

        for ( MovieChild movie : movies ) {
            movie.propDisplay();
        }

    }

}



// for ( int i = 0; i < n; i++ ) {

//     String name = sc.nextLine();
//     Integer rating = sc.nextInt();
//     Integer moneyCollection = sc.nextInt();
//     Integer profit = sc.nextInt();
//     sc.nextLine();
//     String leadActor = sc.nextLine();
//     String leadActress = sc.nextLine();

//     movies[i] = new Movie(
//         name,
//         rating,
//         moneyCollection,
//         profit,
//         leadActor,
//         leadActress
//     );

// }