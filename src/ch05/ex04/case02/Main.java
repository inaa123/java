package ch05.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Player.teamName = "tigers";
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		player1.setName("최한석");
		player2.setName("한아름");
		
		System.out.printf("%s, %s\n", player1.getName(), player1.getTeamName());
		System.out.printf("%s, %s\n", player1.getName(), Player.getTeamName());
		System.out.printf("%s, %s\n", player2.getName(), player2.getTeamName());
	}
}
