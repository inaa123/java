package ch05.ex08.case02;

import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private LocalDate regDate;
	
	/*
	public User(User this, String name, int age, LocalDate regDate) 우리가 쓰면 안됨
		this.name = name;
		this.age = age;
		this.regDate = regDate;
	*/
	public User() {} //기본생성자 쓰고싶을시 이렇게 선언해 놓고 main클래스에서 쓸수이따
	
	public User(String name, int age, LocalDate regDate) {
		this.name = name;
		this.age = age;
		this.regDate = regDate;
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
}
