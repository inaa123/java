package ch05.ex08.case04;

public class Deposit {
	private int balance;
	
	public Deposit() {
		//this.balance = 1000; 나쁜코드임. 아래는 리팩토링한거
		this(1000);
	}
	
	public Deposit(int principal) {
		//this.balance = principal; //this.뭐시기 호출문쓰는 이유 : 중복제거
		this(principal, 0); //0인이유 위에가 this.balance = principal + 0이라고 생각할수있기때문
	}
	
	public Deposit(int principal, int interest) {
		this.balance = principal + interest;
	}
	
	public int getBalance() {
		return this.balance;
		//return balance; //이거도 가능
	}
}
