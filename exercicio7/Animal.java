package exercicio7;

public class Animal {
	private String nome;
	private String especie;
	
	Animal(String especie, String nome){
		this.especie = especie;
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String toString() {
		return "Espécie " + getEspecie() + "\nNome: " + getNome();
	}
	
}
