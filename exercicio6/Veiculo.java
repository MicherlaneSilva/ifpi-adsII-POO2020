package exercicio6;

public class Veiculo {
	protected String placa;
	protected int ano;
	protected int modelo;
	
	Veiculo(String placa, int ano, int  modelo){
		this.placa = placa;
		this.ano = ano;
		this.modelo = modelo;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getModelo() {
		return this.modelo;
	}
	
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String toString() {
		return "Placa: " + placa + "\nAno: " + ano + "\nModelo: " + modelo;
	}
	
}
