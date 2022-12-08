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
}

class F_HR_ArrayOfObjects1_1 {

    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Movie[] arr = new Movie[n];

        sc.nextLine();
        for ( int i = 0 ; i < n ; i++ ) {    
            String name = sc.nextLine();
            Integer rating = sc.nextInt() ;
            Integer moneyCollection = sc.nextInt() ;
            Integer profit = sc.nextInt() ;
            sc.nextLine();
            String leadActor = sc.nextLine() ;
            String leadActress = sc.nextLine() ;
            
            // Movie obj = new Movie(name, rating, moneyCollection, profit, leadActor, leadActress);
            // arr[i] = obj;

            arr[i] = new Movie(name, rating, moneyCollection, profit, leadActor, leadActress);

            // arr[i] = sc.nextInt();

        }

        // for ( int i = 0 ; i < n ; i++ ) {
        //     System.out.println(arr[i]);
        // }

        for ( int i = 0 ; i < n ; i++ ) {
            System.out.println(arr[i].name);
            System.out.println(arr[i].rating);
            System.out.println(arr[i].moneyCollection);
            System.out.println(arr[i].profit);
            System.out.println(arr[i].leadActor);
            System.out.println(arr[i].leadActress);
        }

    }

}
