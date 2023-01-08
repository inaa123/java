package ch07.ex06.case02;

public class Alien extends Life{//외계인은 생명체이다.
	//@Override static메서드는 상속되지X, Override X, Override는 상속을전제로
	public static void eat() {
		System.out.println("Alien 먹다.");
	}
	
	@Override
	public void shout() {
		System.out.println("Alien 소리치다.");
	}

}
