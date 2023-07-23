package boot.example.j2se.collections.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class StreamsApi {

public static void main(String[] args) {
            List<Person> people = Arrays.asList(
			new Person[] {
					new Person("Rajeev", 23, Gender.MALE),
					new Person("Sarala", 13, Gender.FEMALE),
					new Person("Sanjeena", 56, Gender.FEMALE),
					new Person("Preeti", 79, Gender.FEMALE),
					new Person("Pravesh", 22, Gender.MALE),
					new Person("Subin", 40, Gender.MALE),
					new Person("Naveen", 13, Gender.MALE),
					new Person("Ayush", 7, Gender.MALE),
					new Person("Ankita", 88, Gender.FEMALE),
					new Person("Pema", 17, Gender.FEMALE),
					new Person("Sanjeena", 56, Gender.FEMALE)
			});
            System.out.println(
            		people.stream().max(Comparator.comparing(p->p.getAge()))
            		.get()
            		);
   
            System.out.println(
    				people.stream()
    				.min(Comparator.comparing(p->p.getAge()))
    				.get()
    				);
            

    		System.out.println("Sorted List: ");
    		people.stream()
    			.sorted(Comparator.comparing(p->p.getName()))
    			.collect(Collectors.toList())
    			.forEach(System.out::println);
    		

  		System.out.println("Reverse Sorted List: ");
  		people.stream()
  		.sorted(Comparator.comparing(p->p.getName()))
  		.collect(Collectors.toList())
  		.forEach(System.out::println);
}
}				
			
         
