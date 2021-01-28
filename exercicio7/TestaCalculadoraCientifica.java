package exercicio7;

public class TestaCalculadoraCientifica {

	public static void main(String[] args) {
		CalculadoraCientifica cf = new CalculadoraCientifica(2, 8);
		System.out.println("Exponeciação: " + String.format("%.2f", cf.exponeciar()));

	}

}
