package ch05.ex03.case01;

public class Tv {
	private String color;
	private boolean power;
	private int channel;
	
	public String getColor() {
		return color;
	} 
	
	public boolean isPower() { //메서드명 is붙은이유 = boolean타입이기때문에
		return power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
}
