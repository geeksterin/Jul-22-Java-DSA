import java.util.*;
public class B_NumsFromxTon {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, x;
		n = sc.nextInt();
		x = sc.nextInt();
		
		for ( int count = x ; count!=n+1 ; count++ ) {
		    System.out.println(count);
		}
		
		
	}
}
