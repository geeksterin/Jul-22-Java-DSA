import java.util.* ;
import java.io.* ;

class YoutubeVideo {

    String song, artist;
    int noOfViews, noOfLikes, releasedYear, n;
    ArrayList<String> comments;

    static int totalVideos = 0;

    YoutubeVideo(String song, String artist, int noOfViews, int noOfLikes, int releasedYear, int n, ArrayList<String> comments) {
        this.song = song;
        this.artist = artist;
        this.noOfViews = noOfViews;
        this.noOfLikes = noOfLikes;
        this.releasedYear = releasedYear;
        this.n = n;
        this.comments = comments;
        YoutubeVideo.totalVideos++;
    }

}

class B_HR_StaticKeyword3_1 {

    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        YoutubeVideo[] arr = new YoutubeVideo[x];
        
        sc.nextLine();
        for ( int i = 0 ; i < x ; i++ ) {
            String song = sc.nextLine();
            String artist = sc.nextLine();
            int noOfViews = sc.nextInt();
            int noOfLikes = sc.nextInt();
            int releasedYear = sc.nextInt();
            int n = sc.nextInt();
            ArrayList<String> comments = new ArrayList<String>();
            sc.nextLine();
            for ( int j = 0; j < n ; j++ ) {
                comments.add(sc.nextLine());
            }
            arr[i] = new YoutubeVideo(song, artist, noOfViews, noOfLikes, releasedYear, n, comments);
        }
        
        System.out.println(YoutubeVideo.totalVideos);

    }

}
