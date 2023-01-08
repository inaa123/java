package ch05.ex09.case02;

public class Phone {
	public static int cnt; //공장에서 폰을 몇개 만들지 셀거야.
	private int serial; //시리얼은 고유의값을 가져야하기 때문에 인스턴스
						//항상실행해야하기 때문에 인스턴스(생성자는 콜할때만 하기때문에 오류발생 ㅇ)
	{
		serial = ++cnt * 100;
	}
	
	public Phone() {}
	
	public Phone(int serial) {
		this.serial = serial;
	}
	
	public int getSerial() {
		return this.serial;
	}

}
