package boot.example.j2se.day5;

import java.util.LinkedList;

public class linkedlist {

	 public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
		 list.add(123);
		 list.add(8993);
		 list.add(898);

		  list.forEach(System.out::println);

	 }
}
