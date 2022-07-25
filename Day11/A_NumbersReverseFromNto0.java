import java.util.*;
public class A_NumbersReverseFromNto0 {
	public static void main(String[] args) {
		
		System.out.println("Hello\nWorld");
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		
		for ( int num=n ; num!=-1 ; num-=1 ) {
		    System.out.print(num+" ");
		}
		
		System.out.println("\n------------------------");
		
		for ( int num=n ; num>=0 ; num-=1 ) {
		    System.out.println(num);
		}
		
	}
}