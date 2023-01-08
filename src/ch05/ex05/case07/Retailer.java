package ch05.ex05.case07;

public class Retailer {//파는행위만 관심ㅇ ,판매할때 농부는 가격이 필요, 유통업자는 사과가 필요. 
	//public Apple sell(Apple apple, int price, int marsine){}
	
	public Apple sell(Apple apple) {
		apple.setPrice(apple.getPrice() * 2); //마진을 붙이는 걸 코드로 표현
		
		return apple;
	}
}
//여기서 apple를 흘러가는 것?이라고 보면 : DTO 
//사과를 데이터라고 보면 : domain (파라미터로 쓰여졌기 때문, 데이터로 쓰였기 때문) 
 //멤버변수가 X 면 domain X 