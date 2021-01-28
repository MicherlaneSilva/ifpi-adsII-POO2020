package exercicio7;

public class Horista extends Diarista{
	
	Horista(){
		super();
	}
	
	public double calcularSalario() {
		return super.calcularSalario() / 24;
	}

}
