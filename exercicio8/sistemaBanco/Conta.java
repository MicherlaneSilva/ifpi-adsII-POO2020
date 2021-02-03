package sistemaBanco;

public class Conta {
	private String nome;
	private double saldo;
	
	Conta(String nome, double saldo){
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "INFORMAÇÕES DA CONTA" + "\n" +
				"Nome do cliente: " + this.nome + "\n" +
				"Saldo R$ " + this.saldo;
	}
}