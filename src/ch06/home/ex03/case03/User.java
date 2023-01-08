package ch06.home.ex03.case03;

public class User {
	private String name;
	private int age;
	
	//생성자 만들기, 생성자는 호출자유로워야하기때문에 public
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//extends Objcet의 toString을 오버라이드해야함. 도메인 속성값으로 구분하는게 편함
	@Override
	public String toString() {
		//return name + " " + age + "살"; 둘다 가능밑에는 또다른 방법!
		return String.format("%s %d살", name, age);
	}
	
	
}
