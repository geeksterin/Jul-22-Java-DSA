import java.util.*;

public class D_UpperOrLowerOrDigitOrNone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Character ch = sc.next().charAt(0);
		
		if ( 'a'<=ch && ch<='z' ) {
		    System.out.println("Lowercase");
		}
		else if ( 'A'<=ch && ch<='Z' ) {
		    System.out.println("Uppercase");
		}
		else if ( '0'<=ch && ch<='9' ) {
		    System.out.println("Digit");
		} 
		else {
		    System.out.println("None");
		}
		
		
	}
}
