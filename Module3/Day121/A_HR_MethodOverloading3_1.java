import java.util.* ;
import java.io.* ;

class YoutubeVideo {

    String song, artist;
    int noOfViews, noOfLikes, releasedYear, n;
    ArrayList<String> comments;

    YoutubeVideo(String song, String artist, int noOfViews, int noOfLikes, int releasedYear, int n, ArrayList<String> comments) {
        this.song = song;
        this.artist = artist;
        this.noOfViews = noOfViews;
        this.noOfLikes = noOfLikes;
        this.releasedYear = releasedYear;
        this.n = n;
        this.comments = comments;
    }

    void add(int x) { 
        this.noOfViews += x;
        System.out.println("Views are added");
        System.out.println(this.noOfViews);
        System.out.println(this.noOfLikes);
    } 
    
    void add(int x, int y) { 
        this.noOfViews += x;
        this.noOfLikes += y;
        System.out.println("Views and likes are added");
        System.out.println(this.noOfViews);
        System.out.println(this.noOfLikes);
    }

}

class A_HR_MethodOverloading3_1 {

    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);

        String song = sc.nextLine();
        String artist = sc.nextLine();
        int noOfViews = sc.nextInt();
        int noOfLikes = sc.nextInt();
        int releasedYear = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<String> comments = new ArrayList<String>();
        sc.nextLine();
        for ( int i = 0; i < n ; i++ ) {
            comments.add(sc.nextLine());
        }

        YoutubeVideo video = new YoutubeVideo(song, artist, noOfViews, noOfLikes, releasedYear, n, comments);

        int k = sc.nextInt();

        if ( k==1 ) {
            int x = sc.nextInt();
            video.add(x);
        } else if (k==2) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            video.add(x,y);
        }

    }

}
