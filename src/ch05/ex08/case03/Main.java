package ch05.ex08.case03;

public class Main {
	public static void main(String[] args) {
		Citrus citrus = new Citrus();
		System.out.println(citrus.getName());
		//생성자에 "레드향"이 있지만 출력하면 null나옴.(버그) 
		//이유: new하면 객체가 생성됨(객체두번생성). 1번객체는 null, 2번객체는 레드향. 여기서 쓰는객체는 1번객체
		
		Citrus citrus1 = new Citrus();
		Citrus citrus2 = new Citrus("레드향");
		//System.out.println(citrus.getName());
		
		System.out.println(citrus1.getName());
		System.out.println(citrus2.getName());
		
	}
}
