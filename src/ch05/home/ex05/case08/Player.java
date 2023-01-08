package ch05.home.ex05.case08;

public class Player {
	private String name;
	
	//public void pass(Ball ball) // void는 공을 차고 정지해 있다.
	public Ball pass(Ball ball) { //패스하고나면 공이있어야하기 때문에 return타입은 ball
		return ball;  //내가 받은 볼을 그대로 넘기기 위해 return 값 ball
	}
	
	public Ball kick(Ball ball) { //킥하고나면 공이있어야 함 => 리턴타입은 볼
		return ball;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}//이름읽어서 뭐할거아니기때문에 getter는 안만들고, 플레이어 이름을 넣기 위해 setter는 만든다.
//객체는 데이터! =>so 객체를 파라미터로 사용 할 수 있고, 리턴타입으로도 쓸 수 있음.