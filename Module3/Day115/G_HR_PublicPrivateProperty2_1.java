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
    private Integer likes ;
    
    Movie() {
        this.name = "NEW_MOVIE";
        this.rating = 0;
        this.moneyCollection = 0;
        this.profit = 0;
        this.leadActor = "ACTOR";
        this.leadActress = "ACTRESS";
    }

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

    private int calculateGrade() {
        return this.likes*10 + this.views;
    }

    public void printGrade() {
        System.out.println(this.calculateGrade());
    }

}
class G_HR_PublicPrivateProperty2_1 {

    public static void main( String args[] ) {

        Movie superman1 = new Movie("Superman 1", 8, 900000, 1000, "Rachel Gupta and Prince Narula","Aarushi", 10000, 500);

        superman1.printGrade();

    }

}
