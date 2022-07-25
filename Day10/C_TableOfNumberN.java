import java.util.*;
public class C_TableOfNumberN {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		for ( int multiple = n ; multiple <= n*10 ; multiple += n ) {
		    
		    System.out.println( n + "x" + (multiple/n) + "=" + multiple);
		    
		}

	}
}
