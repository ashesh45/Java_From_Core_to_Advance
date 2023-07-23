package boot.example.j2se.controlstatement;
import java.util.Scanner;
public class multipication {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number:");
		int m=s.nextInt();
				for(int i=1; i<=10; i++)
				{
					System.out.println(m+" * "+i+" = "+m*i);
				}
	}
}
