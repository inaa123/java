package ch07.ex02.service;

import ch07.ex02.domain.User;

public interface UserService {
	public User getUser(); //유저읽기 , 서비스와 dao다르다(서비스는get, dao는select)

}
