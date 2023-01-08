package ch06.ex06.case05;

import java.time.LocalDate;

//인터페이스에 멤버변수 입력하기. PUBLIC : 캡슐화X, 공개함 
//인터페이스~ 코드임... 안변함......... 안변할것..... so final.... 
public interface Electronic {
	public static final int VOLTAGE = 200; //전압은 200
	static final String MAKER_NAME = "LG";//public안써도 public들어감
	final int WEIGHT = 10; //public static 안써도 들어감
	LocalDate PRODUCED_DATE = LocalDate.now(); //public static final작성 안해도 컴파일러가 알아서 함.
	
	public abstract void displayMsg(); //추상메소드만들때도 abstract작성.
	abstract int getTemperature(); //public 빼도 컴파일러가 자동 추가
	String getModelName(); //public abstract빼도 자동추가됨
	
}
