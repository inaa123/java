package ch03.ex02;

public class C02Not { //논리부정연산자 -> 조건문에서 많이 씀
	public static void main(String[] args) {
		boolean power = false; //전원이 꺼져있다.
		power =! power; //toggle
						/*값이 두개뿐인 변수 => flag variable.
						power의 값이 두개 뿐일 경우 =!를 사용하면 false ->true , true -> false*/
		System.out.println(power);
		
		power =! power;
		System.out.println(power);
	}
}
