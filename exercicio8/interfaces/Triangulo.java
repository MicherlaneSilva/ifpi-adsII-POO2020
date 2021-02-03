package interfaces;

public class Triangulo implements CalculosDaFigurasInterface{
	private double ladoA;
	private double base;
	private double ladoB;
	private double altura;
	
	
	Triangulo(double ladoA, double ladoB, double base, double altura){
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.base = base;
		this.altura = altura;
	}


	public double getLadoA() {
		return ladoA;
	}


	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getLadoB() {
		return ladoB;
	}


	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	public double calcularArea() {
		return this.getAltura() * this.getBase();
	}
	
	public double calcularPerimetro() {
		return this.getBase() + this.getLadoA() + this.getLadoB();
	}
	
	public String toString() {
		return "Triangulo \n" + "Lado A: " + ladoA +
				"\nBase: " + base +
				"\nLado B: " + ladoB +
				"\nAltura: " + altura ;
	}
	
	
}
