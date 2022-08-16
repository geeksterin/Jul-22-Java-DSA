public class D_aToZAlternateCase {
	public static void main(String[] args) {
    
	    for ( int ch = 97 ; ch <= 122 ; ch++ ) {
	        
	        if ( ch%2==0 ) {
	            System.out.print( Character.toUpperCase((char)ch ) + " ");
	        } else {
	            System.out.print( (char)ch + " ");
	        }
	        
	    }
		
	}
}
