package ch07.ex07.case02;

@FunctionalInterface
public interface Human { //디폴트메서드 스태틱메서드 람다 가능
	void say();
	
	static void walk() {
		System.out.println("Human walk.");
	}
	
	default void sleep() {
		System.out.println("Human sleep.");
	}
}
