package sistemaBanco;

public class ContaCorrente extends Conta implements Tributavel{
	ContaCorrente(String nome, double saldo){
		super(nome, saldo);
	}
	
	public double calcularTributos() {
		return super.getSaldo() * 10 / 100;
	}

}
