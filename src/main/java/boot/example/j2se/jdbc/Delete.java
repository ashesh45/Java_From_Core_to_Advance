package boot.example.j2se.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/end_point_tech", "root", "root");
		String query = "delete from user where id=?";
		Scanner sc = new Scanner(System.in);
	
	   System.out.println("Enter the id: ");
	    int id = sc.nextInt();
		PreparedStatement pstm = con.prepareStatement(query);
        pstm.setInt(1, id);
        
		int i =pstm.executeUpdate();
		if(i==0) {
		
			
			System.out.println("deletion failed");
		}
		else {
			System.out.println("User deleted from database");
		}
		pstm.close();
		con.close();
	}

}
