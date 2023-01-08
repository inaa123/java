package ch05.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pajamas pajamas = new Pajamas();
		Man man = new Man();
		/*
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie(); //내일 잠자기
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie(); //다음날 잠자기 (메소드 중복 발생 => 메소드 또 만들기)
		*/
		man.sleep(pajamas);
		man.sleep(pajamas);
		man.sleep(pajamas);
		man.sleep(pajamas);// 위에 4문장을 하나의 코드로! 중복을 줄일수있따!!!
	}
}
