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

class F_HR_ArrayOfObjects2_2 {

    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Influencer[] arr = new Influencer[n];

        for ( int i = 0 ; i < n ; i++ ) {    
            String name = sc.nextLine();
            Integer total_posts = sc.nextInt();
            Integer total_reels = sc.nextInt();
            Boolean blue_tick = sc.nextBoolean();
            Integer followers = sc.nextInt();
            Integer following = sc.nextInt();
            sc.nextLine();
            String category = sc.nextLine();
            Character gender = sc.next().charAt(0);
            arr[i] = new Influencer(name, total_posts, total_reels, blue_tick, followers, following, category, gender);
        }


        for ( int i = 0 ; i < n ; i++ ) {
            System.out.println(arr[i].name);
            System.out.println(arr[i].total_posts);
            System.out.println(arr[i].total_reels);
            System.out.println(arr[i].blue_tick);
            System.out.println(arr[i].followers);
            System.out.println(arr[i].following);
            System.out.println(arr[i].category);
            System.out.println(arr[i].gender);
        }

    }

}
