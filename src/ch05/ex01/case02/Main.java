package ch05.ex01.case02;

public class Main {
	public static void main(String[] arsg) {
		//한사람을 생각했지만 두개의 코드.. 코드상 한사람의 정보가 X 머릿속과 코드가 다름
		String name = "최한석";
		int age = 35;
		System.out.printf("%s는 %d살입니다.\n", name, age); //메시지로 한사람임을 표현
		
		User user = new User();
		user.name = "최한석";
		user.age = 35;
		System.out.printf("%s는 %d살입니다.", user.name, user.age);
	}
}
