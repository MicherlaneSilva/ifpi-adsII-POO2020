package exercicio7;

public class Bovino extends Animal{
	private float producaoLeite;
	
	Bovino(String especie, String nome, float producaoLeite){
		super(especie, nome);
		this.producaoLeite = producaoLeite;
	}

	public float getProducaoLeite() {
		return producaoLeite;
	}

	public void setProducaoLeite(float producaoLeite) {
		this.producaoLeite = producaoLeite;
	}

	@Override
	public String toString() {
		return "Espécie: " + super.toString() 
		+ "\nProdução de leite: " + this.getProducaoLeite();
	}
	
	
}
