package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		//아기가 태어난 후 이름이 생김
		Baby baby = new Baby();//Baby()가 원래 존재했기 때문에 여기서 쓸 수 있는 것.
		baby.setName("초롱이");
		
		//태어나면서부터 이름을 가짐
		Baby baby2 = new Baby("튼튼이");
	}
}
//메소드 콜하는 법 3가지
// : 1. 클래스.메서드(static메서드) 2.객체.메서드(인스턴스메서드) 3.new 메서드(생성자)