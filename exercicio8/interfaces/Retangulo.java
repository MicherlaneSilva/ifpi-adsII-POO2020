package interfaces;

public class Retangulo implements CalculosDaFigurasInterface{
	private double base;
	private double altura;
	
	Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		return this.base * this.altura;
	}
	
	public double calcularPerimetro() {
		return 2 * this.base + 2 * this.altura;
	}
	
	@Override
	public String toString() {
		return "Retangulo \n" +
				"Base: " + base + 
				"\nAltura: " + altura;
	}
	
	
}
