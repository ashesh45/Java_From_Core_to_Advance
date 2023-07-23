package boot.example.j2se.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetOne {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/end_point_tech", "root", "root");
		String query = "select * from user where id=?";
		Scanner sc = new Scanner(System.in);
	
	   System.out.println("Enter the id: ");
	    int id = sc.nextInt();
		PreparedStatement pstm = con.prepareStatement(query);
        pstm.setInt(1, id);
        
		ResultSet rs =pstm.executeQuery();
		if(rs.next()) {
			User user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"));
			
			System.out.println(user);
		}
		else {
			System.out.println("No such user found");
		}
		pstm.close();
		con.close();
	}

}
