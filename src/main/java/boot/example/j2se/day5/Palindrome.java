package boot.example.j2se.day5;
import java.util.*;
public class Palindrome {
	
	
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = reverse(num);
		if(rev==num) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

	private static int reverse(int n) {		//12345
		int rev=0, rem;
		while(n>0) {			//false
			rem=n%10;			//1
			rev=rev*10+rem;		//54321
			n/=10;				//0
		}
		return rev;
	}

}
