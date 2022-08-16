import java.util.*;

public class B_TableOfNButReverse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for ( int multiplier = 10 ; multiplier >= 1 ; multiplier-=1  ) {
		    
		    System.out.println(n + "x" + multiplier + "=" + (n*multipier) );
		
		}
		
	}
}
