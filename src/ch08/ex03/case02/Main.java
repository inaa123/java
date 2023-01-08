package ch08.ex03.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "hello";
		try {
			if(userId.length() > 3)
				throw new LengthException("문자 길이가 초과되었습니다.");
	
		} catch(LengthException e) {
			e.printStackTrace();
		}
		
		throw new NumberException("숫자가 아닙니다.");
	}
}