package ch07.ex02.presentation;

public interface Console {
	static void info(Object obj) {//인터페이스 static은 public이 붙어있음
		System.out.println(obj);	//어떤값이든 object으로 프로모션됨
	}
}