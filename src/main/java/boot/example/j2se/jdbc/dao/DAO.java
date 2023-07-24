package boot.example.j2se.jdbc.dao;

import java.util.List;

public interface DAO<T,I> {
	public void connect();
	public void disconnect();
	public void save(T t);
	public int update(T t);
	public List<T> getOne(int i);
	public int delete(T t);
	public List<T> getAll(T t);
	

}
