import java.util.* ;
import java.io.* ;

class YoutubeVideo {

    String song, artist;
    int noOfViews, noOfLikes, releasedYear, n;
    ArrayList<String> comments;
    YoutubeVideo() {
        comments = new ArrayList<String>();
    }
}

class E_HR_ArrayOfObjects2_1 {

    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);

        YoutubeVideo video = new YoutubeVideo();

        video.song = sc.nextLine();
        video.artist = sc.nextLine();
        video.noOfViews = sc.nextInt();
        video.noOfLikes = sc.nextInt();
        video.releasedYear = sc.nextInt();
        video.n = sc.nextInt();
        
        sc.nextLine();
        for ( int i = 0; i < video.n ; i++ ) {
            video.comments.add(sc.nextLine());
        }

        System.out.println(video.song);
        System.out.println(video.artist);
        System.out.println(video.noOfViews);
        System.out.println(video.noOfLikes);
        System.out.println(video.releasedYear);
        System.out.println(video.n);
        for ( String comment : video.comments ) {
            System.out.println(comment);
        }

    }

}
