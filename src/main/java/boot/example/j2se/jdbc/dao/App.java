package boot.example.j2se.jdbc.dao;

import java.util.List;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		char ch;
		System.out.println("-------MAIN MENU-------");
		System.out.println("a. Add a user");
		System.out.println("b. view a user");
		System.out.println("c. view all users");
		System.out.println("d. update a user");
		System.out.println("e. delete a user");
		
		do {
			System.out.println("Make a Choice: ");
			ch = sc.next().charAt(0);		
		}while(!(ch=='a'||ch=='b'||ch=='c'||ch=='d'||ch=='e'));
		
		if(ch=='a') {
			User user = getUserDetails();
			int i = userDao.save(user);
			if(i==0) {
				System.out.println("Insertsion failed!");
			}
			else {
				System.out.println("Data inserted to the database!");
			}
		}
		
		
			
			else if(ch=='b') {
				System.out.println("Enter the id: ");
				int id = sc.nextInt();
				User user = userDao.GetOne(id);
				System.out.println(user);
			}
			
			else if(ch=='c') {
				System.out.println("Users List: ");
				List<User> users = userDao.getAll();
				if(!users.isEmpty()) {
					users.forEach(System.out::println);
				}
				else {
					System.out.println("There are no users in the database!");
				}
			}
		}
		
		private static User getUserDetails() {
			
			 User user = new User();
			 System.out.println("Enter user Details: ");
			 System.out.println("Name");
			 sc.nextLine();
			
			 user.setName(sc.nextLine());
			 System.out.println("Enter user Details: ");
			 user.setEmail(sc.next());
			 	return user;
			 
		}
}
		
