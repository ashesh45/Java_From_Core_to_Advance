package boot.example.j2se.day5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preparedstatement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/end_point_tech", "root", "root");
		String query = "insert into user(name, email) values(?,?)";
		String name="Pratima Shakya";
		String email = "praitma@gmail.com";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, name);
		pstm.setString(2, email);
		int i = pstm.executeUpdate();
		if(i==0) {
			System.out.println("Insertsion failed!");
		}
		else {
			System.out.println("Data inserted to the database!");
		}
		pstm.close();
		con.close();
	}

}
