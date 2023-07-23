package boot.example.j2se.Assignment1;
import java.util.*;
public class binD {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a binary number: ");
	        String binary = scanner.nextLine();

	        int decimal = 0;
	        int power = 0;

	        for (int i = binary.length() - 1; i >= 0; i--) {
	            if (binary.charAt(i) == '1') {
	                decimal += Math.pow(2, power);
	            }
	            power++;
	        }

	        System.out.println("Decimal representation: " + decimal);
	    }
	
	}
