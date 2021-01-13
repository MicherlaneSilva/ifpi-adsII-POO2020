package poo;

public class Jogador {
	int forca;
	int nivel;
	int pontosAtuais;
	
	Jogador(int forca, int nivel, int pontosAtuais){
		this.forca = forca;
		this.nivel = nivel;
		this.pontosAtuais = pontosAtuais;
	}
	
	int calcularPontosAtaque() {
		return this.forca * this.nivel;
	}
	
	void atacar(Jogador player) {
		player.pontosAtuais = player.pontosAtuais - this.calcularPontosAtaque();
	}
	
	
}
