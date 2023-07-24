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
		String query = "update * from user set tName=?, temail=? where id=?";
		Scanner sc = new Scanner(System.in);
	
	   System.out.println("Enter the new name: ");
	    int name = sc.nextInt();
	    
	    System.out.println("Enter the new email: ");
	    int email = sc.nextInt();
	        
	    
		PreparedStatement pstm = con.prepareStatement(query);
		
		pstm.setString(4,name);
		pstm.setString(5, email);
		
        pstm.setInt(1, name);
        
        pstm.executeUpdate();
        
        System.out.println("done");
        pstm.close();
        con.close();
	}
	}
		

	    
	

