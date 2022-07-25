import java.util.*;
public class D_EventNumbersOnly {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		for ( int evenNum = x ; evenNum <= y ; evenNum += 2 ) {
		    System.out.println(evenNum);
		}
		
		System.out.println("--------------------");
		
		for ( int num = x ; num <= y ; num++ ) {
		    
		    if ( num%2 == 0 ) {
		        System.out.println(num);
		    }
		    
		}
		
		
	}
}
