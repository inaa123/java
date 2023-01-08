package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	//static초기화블럭
	static {
		//this.i = 1; //컴파일에러 : this변수는 메서드 첫번째파라미터에서 this가 선언이 됐기 때문에 썼던 거지. 
		//여기선 this변수가 선언되지 않았기 때문에 쓸수 없음.
		Init.s = 1; //s가 스태틱변수임을 명확히 알려주기 위해 Init.붙임! 없어도 알아들음.
		System.out.println("static{}"); //바이트코드 로딩 후 생성..?	
	}
	
	//이름없는블럭 : 인스턴스초기화블럭.(메소드안아님 클래스안에 있는거임! 전에 쓰던거랑 달라)
	{
		Init.s = 1;
		this.i = 1;
		System.out.println("{}"); //new한후 생성된거
	}
	
	public Init() {
		Init.s = 1;
		this.i = 1;
		System.out.println("Init()");
	}
	
	public Init(int i) {
		Init.s = i;
		this.i = i;
		System.out.println("Init(int)");
	}
}
