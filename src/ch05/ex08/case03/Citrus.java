package ch05.ex08.case03;

public class Citrus {
	private String name;
	
	//생성자는어떻게 호출해야하는가?
	public Citrus() {
		//this.Citrus("레드향"); new생성자에서 new가 빠짐
		//new Citrus("레드향"); //새로운 생성자생ㄱㅣㅁ
		this("레드향"); //=> 이러면 main에서 null값이 안나옴. 생성자1개
		//this.name = "레드향"; =>나쁜코드 이유 : 중복코드, 하드코드
	}
	
	public Citrus(String name) {
		this.name = name; //멤버변수 name
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
// 순서: 멤버변수 - 생성자 - 일반메소드 - 게터세터