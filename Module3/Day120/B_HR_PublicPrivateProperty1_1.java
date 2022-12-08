import java.util.* ;
import java.io.* ;

class Movie {

    String name;
    Integer rating;
    Integer moneyCollection;
    Integer profit;
    String leadActor;
    String leadActress;
    private Integer views;
    private Integer likes;

    Movie(String name, Integer rating, Integer moneyCollection, Integer profit, String leadActor, String leadActress, 
    Integer views, Integer likes) {
    
        this.name = name;
        this.rating = rating;
        this.moneyCollection = moneyCollection;
        this.profit = profit;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
        this.views = views;
        this.likes = likes;
    }

    void displayLikes() {
        System.out.println(this.likes);
    }
    void displayViews() {
        System.out.println(this.views);
    }

}
class B_HR_PublicPrivateProperty1_1 {

    public static void main( String args[] ) {

        Movie superman1 = new Movie("Superman 1", 8, 90000, 1000, "Rachel Gupta and Prince Narula","Aarushi", 10000, 500);

        System.out.println(superman1.name);
        System.out.println(superman1.rating);
        System.out.println(superman1.moneyCollection);
        System.out.println(superman1.profit);
        System.out.println(superman1.leadActor);
        System.out.println(superman1.leadActress);

        superman1.displayViews();
        superman1.displayLikes();

    }

}
