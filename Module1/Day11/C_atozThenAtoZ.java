public class C_atozThenAtoZ {
	public static void main(String[] args) {
    
	    for ( Character ch = 'a' ; ch <= 'z' ; ch++ ) {
	        System.out.print(ch + " " );
	    }
	    System.out.println();
	    for ( Character ch = 'Z' ; ch >= 'A' ; ch-- ) {
	        System.out.print(ch + " " );
	    }
		
	}
}
