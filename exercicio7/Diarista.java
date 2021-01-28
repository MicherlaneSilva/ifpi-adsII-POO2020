package exercicio7;

public class Diarista extends Empregado{
	Diarista(){
		super();
	}
	
	public double calcularSalario() {
		return super.calcularSalario() / 2;
	}
	
}
