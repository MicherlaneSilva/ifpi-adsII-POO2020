package poo;

public class TestaJogador {
	public static void main(String[] args) {
		Jogador j1 = new Jogador(4, 9, 100);
		Jogador j2 = new Jogador(5, 10, 100);
		
		j2.atacar(j1);
		j1.atacar(j2);
		
		System.out.println("Pontos j1:" + j1.pontosAtuais);
		System.out.println("Pontos j2:" + j2.pontosAtuais);
		
	}
}
