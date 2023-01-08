package ch02.ex02;

public class C05SB {
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("우리 개는 ");
		
		int len = src.length();
		System.out.println("length : " + len);
		
		src.append("짖는다.");
		src.replace(3, 4, "고양이"); //개를 고양이로 /잇
		
		String str = src.toString(); //String타입으로 변환시키기.
		
		System.out.println(src); //StringBuffer타입
		System.out.println(str); //String타입
	}
}