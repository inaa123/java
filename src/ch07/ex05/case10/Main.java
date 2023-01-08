package ch07.ex05.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bumblebee bumblebee = new Bumblebee();
		Prime prime = new Prime();
		List<Autobot> corps = new ArrayList<>(); //범블비와 프라임이 만든 군단. 오토봇이 단원
		
		corps.add(bumblebee);
		corps.add(prime);//범블비와 프라임 단원에 참여.
		
		for(Autobot autobot: corps) { //범블빈지프라임인지X, 오토봇이 싸움
			autobot.run();
			autobot.fight();
			//autobot.guard(); 오토봇이 범블비면 가드 가능하지만, 여기선 그냥 오토봇임.
			//변신 :타입을 바꾸다. 캐스팅은 X 오토봇이 범블빈지 프라임인지 모르니까
			
			//범블비인지 프라임인지 조사해보기. 맞으면 캐스팅
			if(autobot instanceof Bumblebee) ((Bumblebee)autobot).guard();
			if(autobot instanceof Prime) ((Prime)autobot).command();
			
		}
		
	}
}
