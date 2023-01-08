package ch06.ex02.case01;

public class A {
	//access identifier. scope이 좁은 -> 넓은 순으로 작성할것
	private int a;
	int b; //default접근제한자 = 아무것도 안적음
	protected int c;
	public int d;
	
	//메소드도 사용 가능
	private void m1() {}
	void m2() {}
	protected void m3() {}
	public void m4() {}
	
	//상속을 전제로 이루어 지는 것 : 못들음.
	
	
}
