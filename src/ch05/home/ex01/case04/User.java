package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private LocalDate regDate; //register Date
	
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
/*
private String name;
private int age;
private LocalDate signDay;

public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public LocalDate getSignDay() {
	return signDay;
}
public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}
public void setSignDay(LocalDate signDay) {
	this.signDay = signDay;
}
*/