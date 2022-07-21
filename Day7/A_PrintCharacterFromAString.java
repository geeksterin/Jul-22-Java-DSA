import java.util.*;

public class A_PrintCharacterFromAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = "Shubh Bansal";
		
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(8));
		System.out.println(s.charAt(10));
		
		Character initial;
		
		initial = 'w';
		System.out.println("1st time:  " + initial);
		
		initial = sc.next().charAt(0);
		System.out.println("2nd time:  " + initial);
		
	}
}
