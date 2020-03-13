package java_game;

public class Combatente {
	private int vida = 100;
	String nome;

	public Combatente(String nome) {
		this.nome = nome;
	}

	public boolean estaVivo() {
		if (vida > 0) {
			return true;
		}

		return false;
	}

	public void receberAtaque(double dano) {
		vida -= dano;
		System.out.println("Vida atual � " + vida);
	}
}
