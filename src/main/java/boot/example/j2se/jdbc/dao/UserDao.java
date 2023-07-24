package boot.example.j2se.jdbc.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> getOne(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> getAll(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User GetOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
