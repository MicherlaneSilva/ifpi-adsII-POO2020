package classesAbstratas;

public class TestarFigurasGeometricas {

	public static void main(String[] args) {
		FiguraGeometrica square = new Quadrado(5);
		FiguraGeometrica triangulo = new Triangulo(5, 5, 5, 7);
		
		System.out.println("área do quadrado: " + square.calcularArea());
		System.out.println("área do triângulo: " + triangulo.calcularArea());

	}

}
