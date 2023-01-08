package ch05.ex08.case01;

public class Baby {
	private String name;
	
	public Baby() {} //=> 컴파일러에 의해 자동으로 생성되어 있음.
	
	public Baby(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
//소스코드에는 생성자가 보이지 않지만 바이트코드상에선 생성자가 존재. 