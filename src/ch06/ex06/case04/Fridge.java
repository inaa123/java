package ch06.ex06.case04;

import ch06.ex06.case03.Appliance;

//에러: 인터페이스 상속받았다. 일반메소드는 호출받으면 뭔가 일을함. 그러나 인터페이스는 몸체가X서 일을할수X(추상적)
public abstract class Fridge implements Appliance { 
	void play() {} //on off는 아직정하지 않았음. 플레이만확정. 그럴댄 클래스 앞에 abstract를 붙여 추상클래스로 만들기
	
}
