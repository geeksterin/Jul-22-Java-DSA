import java.util.*;

public class C_LetterJump {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Character ch = sc.next().charAt(0);
		
		if ( 'a'<=ch && ch<='z' ) {
		    
		    if ( 'a'<=ch && ch<='w' ) {
		        
		        System.out.println( (char)(ch+3) );
		        
		    }
		    else {
		        System.out.println("Can't Jump");
		    }
		    
		} else {
		    System.out.println("Not a small case");
		}
		
		
		
	}
}
