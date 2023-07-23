package boot.example.j2se.controlstatement;

import java.util.Scanner;

public class IfStatement {
  public static void main(String[] args) {
	  int age;
	  System.out.println("Enter you age");
	  Scanner sc = new Scanner(System.in);
	  age = sc.nextInt();
	  if(age<18)
		  System.out.println("Minor");
	  else {
		  System.out.println("Adult");
	  }
  }
	
}
