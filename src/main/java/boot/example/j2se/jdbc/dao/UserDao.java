package boot.example.j2se.jdbc.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao extends AbstractDAO<User, Integer>{

	@Override
	public int save(User user) {
		connect();
		String query = "insert into user(name, email) values(?,?)";
		int i=0;
		try {
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, user.getName());
		pstm.setString(2, user.getEmail());
		i = pstm.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		disconnect();
		return i;
		
	}

	@Override
	public int update(User t) {
		connect();
		int i=0;
		String Query = "Update user SET name=?, Email=? where id=? ";
		PreparedStatement pstm;
		try {
			pstm=con.prepareStatement(Query);
			pstm.setString(1, t.getName());
			pstm.setString(2, t.getEmail());
			pstm.setInt(3, t.getId());
			i= pstm.executeUpdate();
			System.out.println(" database Updated");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		disconnect();
		return i;
	}


		
	


	@Override
	public List<User> getAll(User t) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User GetOne(Integer id) {
		connect();
		String query = "select * from user where id=?";
		PreparedStatement pstm;
		try {
			pstm = con.prepareStatement(query);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()) {
				User user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"));
				disconnect();
				return user;
			}
			else {
				System.out.println("No such user found!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		disconnect();
		return null;
	}

	@Override
	public int delete(User t) {
		
		return 0;
	}
	
	}

