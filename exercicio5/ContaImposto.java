package exercicio5;

public class ContaImposto {
	private double saldo;
	private int numero;
	
	ContaImposto(int numero, double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void creditarValor(double valor) {
		setSaldo(getSaldo() + valor);
	}
	
	private double reterImposto(double valor) {
		return valor * 0.38;
	}
	
	public void debitarValor(double valor) {
		setSaldo(getSaldo() - valor - reterImposto(valor));
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double d) {
		this.saldo = d;
	}
	
}

