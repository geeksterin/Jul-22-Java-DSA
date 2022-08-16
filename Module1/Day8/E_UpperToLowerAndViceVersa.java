import java.util.*;

public class E_UpperToLowerAndViceVersa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Character ch = sc.next().charAt(0);
		
		if ( 'a'<=ch && ch<='z' ) {
		    System.out.println( (char)(ch-32) );
		}
		else if ( 'A'<=ch && ch<='Z' ) {
		    System.out.println( (char)(ch+32) );
		} else {
		    System.out.println( "!@#$ off" );
		}
		
		
	}
}
