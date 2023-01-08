package ch07.ex03.dao;

import ch07.ex03.domain.User;

public interface UserDao {
	public User selectUser();
	public void insertUser(User user); //쓰고나서 리턴되는거 X -> VOID
	
}
