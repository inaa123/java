package ch07.ex02;

import ch07.ex02.dao.UserDao;
import ch07.ex02.dao.UserDaoImpl;
import ch07.ex02.presentation.Console;
import ch07.ex02.presentation.UserIo;
import ch07.ex02.service.UserService;
import ch07.ex02.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		//객체들간 관계를 맺음. 이것이 앱!
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao); //서비스와 dao를 조립. has a관계
		UserIo userIo = new UserIo(userService);// has a관계
		
		Console.info("시작");
		userIo.play();
		Console.info("끝");
	}
} //domain은 일을하지 x domain은 그냥 데이터임!!
