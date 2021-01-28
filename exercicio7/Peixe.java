package exercicio7;

public class Peixe extends Animal{
	private int profundidade;
	
	Peixe(String especie, String nome, int profundidade){
		super(especie, nome);
		this.profundidade = profundidade;
	}

	public int getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}

	@Override
	public String toString() {
		return "Espécie: " + super.getEspecie()
			+ "\nProfundidade: " + this.getProfundidade();
	}
	
	
}
