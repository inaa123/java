package ch06.ex06.case07;

public class Main {
	public static void main(String[] args) {
		int val = 1;
		
		switch(val) { //가독성이 떨어짐. 1과 2가 뭔제 개발자는 생각해야함.
		case 1: 
		case 2: 
		}
		
		//CODE가 있는 경우 이렇게 씀 , 가독성 좋아짐
		switch(val) {
		case Code.USER_ADD:
		case Code.USER_DEL:
		}
		
	}
}
