package ch05.home.ex06.case02;

public class Main {
	public static void main(String[] args) {
		
		Console.inStr("문자를 입력하세요.");
		Console.inNum("숫자를 입력하세요.");
		
		Console.err("전원이 끊깁니다.");
		Console.info("끝.");
	}
}
/*
Console 을 고도화하라. inStr과 inNum의 알고리즘을 바꾸면됨!!
예외처리한다.
Console.inStr() ; 한글자 이상 입력해야 한다.
Console.inNum() ; 한자리 자연수를 입력해야한다.
------

문자를 입력하세요.
> hello
숫자를 입력하세요.
> 12
ERROR] 한자리 자연수를 입력하세요. (해결책 제시)
숫자를 입력하세요. (반복수행)
>1
끝.
*/