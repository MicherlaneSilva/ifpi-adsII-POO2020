package exercicio5;

public class TestaImpostos {
	public static void main(String[] args) {
		ContaImposto ci = new ContaImposto(01, 800);
		
		ci.creditarValor(200);
		System.out.println(ci.getSaldo());
		ci.debitarValor(200);
		System.out.println(ci.getSaldo());

	}

}
