package ch08.ex01;

//@Field 컴파일 에러.  
@Universal
@Type(name="class", value=1) //Type어노테이션, 속성값=속성타입맞게 쉼표로 연결, 데이터를 메타데이터)
public class MyClass {
	//속성명생략하고 속성값만 쓸 수 있다. or value=1로 쓸 수도 있음.
	@Field(1) @Universal
	private String name;
	
	@Constructor 
	public MyClass() {
	}
	
	/*
	@Method //메소드어노테이션 
	public void play() {
		
	}
	*/
	
	@Method 
	public void play(@Param String name, @Param int age) {//파람어노테이션 사용하는 
		@Local int i = 0; //로컬어노테이션 사용
	}
	
}
