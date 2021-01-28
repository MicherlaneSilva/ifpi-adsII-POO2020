package exercicio7;

public class Empregado {
	private double salario = 500;
	
	Empregado(){
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public String toString() {
		return "Salário: R$ " + getSalario();
	}
	
	public double calcularSalario() {
		return getSalario();
	}
	
}
