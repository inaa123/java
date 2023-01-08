package ch02.ex02;

public class C04Str {
	public static void main(String[] args) {
		String src = "우리 개는 ";
		String s1 = "";
		String s2 = "";
		String s3 = "";
		char c = 0;
		
		int len = src.length(); //src의 길이.
		System.out.println("length: " + len);
		
		s1 = src.concat("짖는다."); //concat값을 리턴해서 s1에 저장.
		s2 = src.replace("개", "고양이"); //개를 고양이로 바꾸기
		s3 = src.substring(0, 4); 
		c = src.charAt(3);
		
		//개 글자만 추출하기
		String s4 = src.substring(3,4);
		System.out.printf("%s\n%s\n%s\n%c\n%s\n", s1, s2, s3, c, s4);
	}
}
