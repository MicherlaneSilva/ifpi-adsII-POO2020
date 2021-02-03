package classesAbstratas;

public class Quadrado extends FiguraGeometrica{
	private double lado;
	
	Quadrado(double lado){
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		return lado * lado;
	}
	
	public double calcularPerimetro() {
		return 4 * lado;
	}
	
	public String toString() {
		return "Quadrado\n" + "lado: " + this.getLado();
	}
}
