package ch05.home.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		
		flower1.name = "창포꽃";
		flower1.petalLength = 7;
		flower1.sepalLnegth = 2;
		
		flower2.name = "코스모스";
		flower2.petalLength = 4;
		flower2.sepalLnegth = 1;
		
		/*
		Flower iris = new Flower();
		iris.petalLen = 7;
		iris.calyx = 2;
		System.out.printf("창포꽃의 꽃잎 길이: %dcm, 꽃받침 길이: %dcm\n", iris.petalLen, iris.calyx);
		
		Flower cosmos = new Flower();
		cosmos.petalLen = 4;
		cosmos.calyx = 1;
		System.out.printf("코스모스의 꽃잎 길이: %dcm, 꽃받침 길이: %dcm", cosmos.petalLen, cosmos.calyx);
		
		[피드백]
		 1. Flower클래스에서 창포꽃 코스모스 데이터X음. -> 꽃이름데이터를 변수명으로씀
		   =>데이터는 변수를 담을 녀석이지 데이터를 쓸 수 x
		 	=>FLWOER에 NAME이라는 멤버변수 선언하면 해결!
		 
		 2. FLOWER클래스에서 flowerpetalLength => (의미?)중복! 꽃꽃잎길이 가 됨. 
		 										또 다른 중복! 클래스명 flower인데 또 flower씀
		 
		*/
	}
}
/*
창포꽃은 꽃잎 길이가 7cm, 꽃받침 길이가 2cm입니다.
코스모스는 꽃잎 길이가 4cm, 꽃받침 길이가 1cm입니다.
*/