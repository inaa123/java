package ch07.ex02.dao;

import ch07.ex02.domain.User;

//UserDao 자식에는 이름 뒤에 Impl붙이기 (약속)
public class UserDaoImpl implements UserDao {
	@Override 
	public User selectUser() {
		return new User("최한석");
	}
	
}
