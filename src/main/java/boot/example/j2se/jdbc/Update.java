package boot.example.j2se.jdbc;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	   
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/end_point_tech", "root", "root");
		String query = "update user set Name=?, email=? where id=?";
		Scanner sc = new Scanner(System.in);
	
	   System.out.println("Enter the new name: ");
	   String  name = sc.next();
	    
	    System.out.println("Enter the new email: ");
	    String email = sc.next();
	    
	    System.out.println("Enter the new id: ");
	    String id = sc.next();
	        
	    
		PreparedStatement pstm = con.prepareStatement(query);
		
		pstm.setString(1,name);
		pstm.setString(2, email);
		pstm.setString(3, id);
        
        pstm.executeUpdate();
        
        System.out.println("database Updated");
        pstm.close();
        con.close();
	}
	}
		

	    
	

