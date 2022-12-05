import java.util.* ;
import java.io.* ;

class Influencer {

    String name;
    Integer total_posts;
    Integer total_reels;
    Boolean blue_tick;
    Integer followers;
    Integer following;
    String category;
    Character gender;
    
    Influencer(String name, Integer total_posts, Integer total_reels , Boolean blue_tick, Integer followers, Integer following, String category, Character gender) {
        this.name = name;
        this.total_posts = total_posts;
        this.total_reels = total_reels;
        this.blue_tick = blue_tick;
        this.followers = followers;
        this.following = following;
        this.category = category;
        this.gender = gender;
    }


}
class D_HR_ClassObjects2_2 {

    public static void main( String args[] ) {

        // Influencer RaftaarMusic = new Influencer(
        //         "Raftaar",
        //         340,
        //         400,
        //         true,
        //         7,
        //         200,
        //         "Rapper",
        //         'M'
        // );

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        Integer total_posts = sc.nextInt();
        Integer total_reels = sc.nextInt();
        Boolean blue_tick = sc.nextBoolean();
        Integer followers = sc.nextInt();
        Integer following = sc.nextInt();
        String category = sc.nextLine();
        Character gender = sc.next().charAt(0);

        Influencer RaftaarMusic = new Influencer(name, total_posts, total_reels, blue_tick, followers, following, category, gender);

        System.out.println(RaftaarMusic.name);
        System.out.println(RaftaarMusic.total_posts);
        System.out.println(RaftaarMusic.total_reels);
        System.out.println(RaftaarMusic.blue_tick);
        System.out.println(RaftaarMusic.followers);
        System.out.println(RaftaarMusic.following);
        System.out.println(RaftaarMusic.category);
        System.out.println(RaftaarMusic.gender);


    }

}
