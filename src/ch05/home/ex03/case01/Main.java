package ch05.home.ex03.case01;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat(); //new가 한마리를 주웠습니다를 표현.
		
		cat.setColor("검은");
		cat.setName("야코미"); //이름을 지어줬습니다를 setName으로 표현
		
		System.out.printf("%s 고양이 한마리를 주웠습니다.\n%s라고 이름을 지어줬습니다.",
				cat.getColor(), cat.getName());
	}
}
/*
검은 고양이 한마리를 주웠습니다.
야코미라고 이름을 지어줬습니다.
*/