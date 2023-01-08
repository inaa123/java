package ch05.ex01.case04;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		user.setName("최한석"); //yes인경우
		user.setName("한아름");
		
		System.out.println(user.getName());
	}
}
