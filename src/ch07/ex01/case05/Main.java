package ch07.ex01.case05;

public class Main {
	public static void main(String[] args) {
		//소방차를 주차장에 둔다.주차장에 잇을땐 소방차로 보지 않고 차로 봄
		Car car = new FireEngine();
		/*
		car.run(); //달릴때도 car로 봄
		//car.water(); 달리면서 물뿌리면X,
		
		FireEngine fireEngine = (FireEngine)car;
		fireEngine.water();
		fireEngine.run();
		
		((Car)fireEngine).run(); 
		*/
	}
}
