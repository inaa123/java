package ch06.ex04.case01;

public class Cat extends Animal {
	//컴파일에러 이유 ; Cat클래스엔 기본생성자.(아무 생성자도 작성하지 않았기때문에,)
	//즉 이 생성자 쪽에서 에러가 난 것이다.
	/*
	1 public Cat() { //해결하기 위해 : 자식클래스 첫번째 생성자 첫줄에는super호출해야함! (부모생성자의 생성자 호출)
		2//super(); //부모생성자 호출, this()는 내 생성자
		3 super("야코미"); //animal스트링호출하는 것. 기본생성자 추가 안하고 이렇게 해결해도 됨.	
	}
	 */
	private int age;
	public Cat(String name, int age) {
		super(name); //부모껀 부모가 초기화해^^ name은 animal에서 초기화...
		//this.name = name; name이 private이기때문에 오류
		this.age = age; //내꺽ㄴ 내가 초기화함^^
	}
	
	public int getAge() {
		return this.age;
	}

	
}
