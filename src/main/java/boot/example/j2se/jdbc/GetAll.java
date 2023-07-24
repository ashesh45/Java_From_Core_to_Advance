package boot.example.j2se.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetAll {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/end_point_tech", "root", "root");
		String query = "select * from user";
		Scanner sc = new Scanner(System.in);
	
		PreparedStatement pstm = con.prepareStatement(query);
        
		ResultSet rs =pstm.executeQuery();
		ArrayList<User> users = new ArrayList<>();
		while(rs.next()) {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setEmail(rs.getString("email"));
			users.add(user);
		}
		
		
		pstm.close();
		con.close();
		
		users.forEach(System.out::println);
	}


}
