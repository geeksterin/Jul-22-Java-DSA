import java.util.*;

public class A_CharMethodsTools {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println(Character.toUpperCase( 'a' ));
	    System.out.println(Character.toLowerCase( 'R' ));
	    
	    System.out.println(Character.isUpperCase( 'W' ));
	    System.out.println(Character.isUpperCase( 'w' ));
	    
	    System.out.println(Character.isLowerCase( 'T' ));
	    System.out.println(Character.isLowerCase( 't' ));
	    
	    System.out.println(Character.getNumericValue( 'a' ));
	    System.out.println(Character.getNumericValue( '7' )+3);
	    
	    System.out.println(Character.isDigit( '0' ));
	    System.out.println(Character.isDigit( 'g' ));
	    
	}
}
