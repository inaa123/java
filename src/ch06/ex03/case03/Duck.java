package ch06.ex03.case03;

public class Duck extends Object{ 
	@Override
	public String toString() { //toString이 언제 상속받았나? extends Object이 생략되어잇음. 
		return "오리";
	}
}
//object과 Object은 다름!! object은 객체, Object은 클래스! 대소문자구분1!!