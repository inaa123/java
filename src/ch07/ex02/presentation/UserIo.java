package ch07.ex02.presentation;

import ch07.ex02.service.UserService;

public class UserIo { //userpresentation인데 넘길어서 줄임~
	//service가 유저를 리턴하고.... 콘솔에 출력....하려면.. 서비스가 필요하대...
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService; //DI : dependency Injection
	}
	
	public void play() {
		Console.info(userService.getUser());
	}
	//유저Io는 최종. 누군가에게 다시 리턴하지X, 그냥 콘솔에 출력만 할거야

}
