package java_game;

import java.util.Random;

public class Batalha {
	private Random rand = new Random();
	private Combatente[] jogadores = new Combatente[2];

	private Combatente sortPlayers() {
		int playerSort = rand.nextInt(2);

		return jogadores[playerSort];
	}
	
	private int ataque(int valor) {
		int ataque = rand.nextInt(valor);

		return ataque;
	}
	
	public Batalha(Combatente Player1, Combatente Player2) {
		jogadores[0] = Player1;
		jogadores[1] = Player2;
	}

	public String Batalhar() {
		while (jogadores[0].estaVivo() && jogadores[1].estaVivo()) {
			Combatente selecionado = sortPlayers();
			int valorAtaque = ataque(10);

			System.out.println(selecionado.nome + " recebeu o dano de: " + valorAtaque);
			selecionado.receberAtaque(valorAtaque);
		}

		if (!jogadores[0].estaVivo()) {
			return "Jogador " + jogadores[1].nome + " venceu a batalha.";
		} else {
			return "Jogador " + jogadores[0].nome + " venceu a batalha.";
		}
	}

}
