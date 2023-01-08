package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); //상수 넣음
		System.out.println(score); //변수 넣음
		System.out.println(100 + 1);
		System.out.println(Math.random()); //괄호()안에 method call도 넣을 수 있음.
		
		System.out.print(200);
		System.out.print(300); // println은 각 parameter를 새로운 줄에 출력, print는 옆으로 출력.
		System.out.print("\n"); // /n은 하나의 문자!!! 
		System.out.print(400);
		
		System.out.printf("%b %c %d %f %s\n" , true, 'a', 10 , 1.15, "hello"); //parameter 2개 사용 첫번째 parameter는 string으로 고정. 출력양식을 
						//boolean char 정수 실수 문자열 줄바꿈
		// [과제] 위 출력문에서 구분자로 /를 사용하세요. => "%b / %c / 는 틀린 것 구분자/뿐만 아니라 빈칸도 포함되어 있음.
		System.out.printf("%b/%c/%d/%f/%s\n" , true, 'a', 10 , 1.15, "hello");
		
		//5자리 수로 제한해서 나타내기
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.15, "hello"); //숫자 양수는 오른쪽 정렬 음수는 왼쪽정렬을 뜻한다.
		 					// 스페이스 값이 있는지 없는지 구분할 땐 || 세로줄 안에 넣어보기
		
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age); 
		System.out.printf("\n%s은 %d살입니다.", name, age);
		System.out.println();
		System.out.println(name + "은 " + age + "살입니다.");
	}
}

