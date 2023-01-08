package ch07.ex07.case04;

public class Smith { //총만드는 애
	public Gun makeGun() {
		return () -> System.out.println("드르륵"); //메서드 return! 람다니까, 메서드도 데이터임~
		
	}
}
