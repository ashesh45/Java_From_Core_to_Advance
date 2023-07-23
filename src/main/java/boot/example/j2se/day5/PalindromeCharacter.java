package boot.example.j2se.day5;
import java.util.*;
public class PalindromeCharacter {
	
	public static void main(String[] args) {
		System.out.println("Enter a word: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String rev = reverse(word);
		//System.out.println(rev);
		if(rev.equals(word)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome!");
		}
		
	}

	private static String reverse(String word) {
		String reverse="";
		for(int i=word.length()-1; i>=0; i--) {
			reverse+=word.charAt(i);
			
		}
		return reverse;
	}

}
