package ch05.ex01.case03;

public class User {
	private String name; //new user하면 name은 힙에 생김
	private int age;
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	//메소드 선언부 //메소드 이름 : 동사로 쓰기
	//setter
	public void setName(String name) { //{}안엔 몸체. 누군가 콜해야지 쓸 수 있음.
		this.name = name; // 색 name name은 지역변수니까 스택에 생김.
	    //하늘색 name이 멤버변수임을 나타내기 위해 this붙임
	}
	
	public void setAge(int age) {//쓰기는set
		this.age = age; //멤버변수age에 파라미터age값 할당되어 저장.
	}
	
	//쓰기. 쓰기말고 읽기도 있다. return값이 있어야함.
	//리턴값이 없으면 void를 작성.리턴값이 있으면 리턴값 타입을 적어야함. 읽기는 get
	
	//getter
	public String getName() {
		return this.name; //name변수의 값을 리턴한다.
	}
	
	public int getAge() {
		return this.age;
	}
	*/
} //setter getter는 읽고쓰기위함.
