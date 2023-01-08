package ch05.ex05.case10;

public class Man {
	//메소드를 사용해도 중복코드가 발생 경우 그리고 해결까지해보자
	public void strip( ) {}
	public void wash() {}
	public void wear(Pajamas pajamas) {} //man이 파자마를 입는다. wear하려면 파자마 필요
	public void lie() {} // 잠을 잔다.//잠자는 과정. 매일매일 무한반복.
	
	//위에 잠자기 무한반복으로 중복코드 발생 => 잠자는 메소드 또 만들기
	public void sleep(Pajamas pajamas) {
		this.strip(); //자기자신 메소드 콜할 수 잇음!! this.
		this.wash();
		this.wear(pajamas);
		this.lie();
	}

}