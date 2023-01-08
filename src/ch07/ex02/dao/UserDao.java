package ch07.ex02.dao;

import ch07.ex02.domain.User;

//인터페이스를 만들자 -> 유지보수를 위해, import
public interface UserDao { //유저읽기
	public User selectUser(); //리턴타입:User, 읽는다 = select
	
}
