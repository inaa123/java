package ch07.ex01.case09;

public class Main { //이야기 진행하려고 메인만듦.
	public static void main(String[] args) {
		Pistol pistol = new Pistol();
		Rifle rifle = new Rifle();
		Shooter shooter = new Shooter();
		
		shooter.setGun(pistol);//setGun / pistol이 gun으로 프로모션
		shooter.fire();
		
		shooter.setGun(rifle); //rifle이 setGun의 파라미터로 쓰이면서 gun으로 프로모션
		shooter.fire();
	}
}
