package exercicio7;
import exercicio5.Calculadora;


public class CalculadoraCientifica extends Calculadora {
	CalculadoraCientifica(float operando1, float operando2){
		super(operando1, operando2);
	}
	
	public double exponeciar() {
		return Math.pow(super.getOperando1(), super.getOperando2());
	}
}
