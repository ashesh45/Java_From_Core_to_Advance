package boot.example.j2se.jdbc.dao;

import java.util.List;

public interface DAO<T,I> {
	public void connect();
	public void disconnect();
	public int save(T t);
	public int update(T t);
	public int delete(Integer id);
	public List<T> getAll(T t);
	User GetOne(Integer id);
	

}
