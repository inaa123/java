package ch05.ex01.case03;

public class Main {
	public static void main(String[] args) {
		/*
		User user1 = new User();
		User user2 = new User();
		
		user1.name = "최한석";
		user1.age = 12;
		
		user2.name = "한아름";
		user2.age = 22;
		*/
		User user = new User(); //vm이 main메소드 콜하고. main이 실행하는 것.
		user.setName("최한석"); //main이 setName을 콜했다.등 )라고 말하면 됨.
		user.setAge(12);
		
		user.setName("한아름");
		//user.name = "양승일";
		
		System.out.printf("%s, %d\n", user.getName(), user.getAge());
		//System.out.printf("%s, %d\n", user.name, user.age);
	}
}
