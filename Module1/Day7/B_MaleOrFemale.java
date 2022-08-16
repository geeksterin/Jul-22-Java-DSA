import java.util.*;

public class B_MaleOrFemale {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Character gender;
		gender = sc.next().charAt(1);
		
		if ( gender=='f' || gender=='F' ) {
		    System.out.println("gender is FEMALE");
		}
		else if ( gender=='m' || gender=='M' ) {
		    System.out.println("gender is MALE");
		} 
		else {
		    System.out.println("gender is NOT SPECIFIED");
		}
		
		
		
	}
}
