package ch05.ex05.case07;

public class Main {
	public static void main(String[] args) { 
		//사과는 main에 불러올 필요 X
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		retailer.sell(farmer.sell(1000));
	}
}
/*
 농부가 사과 수확. 천원이랑 가격을 붙여 유통업자에게 판매.
  유통업자는 사과에 2배로 가격을 붙여 판매 
  retailer.sell로 끝내기
 */