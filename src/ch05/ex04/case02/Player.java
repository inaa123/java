package ch05.ex04.case02;

public class Player { //∆¿∏Ì∞∞¿ª∂© static¿Ã ¿˚¥Á«‘.
	public String name;
	public static String teamName;

	public String getName() {
		return name;
	}

	public static String getTeamName() {
		return teamName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void setTeamName(String teamName) {
		Player.teamName = teamName;
	}
	
}
