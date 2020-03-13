package java_game;

public class Jogo {
	public static void main(String[] args) {
		Combatente player1 = new OrcDeserto("OrcDeserto");
		Combatente player2 = new Dragao("Dragao");

		Batalha batalha = new Batalha(player1, player2);
		System.out.println(batalha.Batalhar());
	}
}
