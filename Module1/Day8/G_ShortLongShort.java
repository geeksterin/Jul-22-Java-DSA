import java.util.*;

public class G_ShortLongShort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a, b;
		a = sc.nextLine();
		b = sc.nextLine();
		
		if ( a.length() > b.length() ) {
		    System.out.println(b+a+b);
		} else {
		    System.out.println(a+b+a);
		}
		
		
		
	}
}
