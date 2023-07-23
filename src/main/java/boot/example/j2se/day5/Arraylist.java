package boot.example.j2se.day5;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<>();
			 list.add(123);
			 list.add(8993);
			 list.add(898);

			  list.forEach(System.out::println);

		 }
}
