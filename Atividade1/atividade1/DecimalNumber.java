
public class DecimalNumber {
	double valorDecimal;
	DecimalNumber(double valorDecimal){
		this.valorDecimal = valorDecimal;
	}
	
	int parteInteira() {
		int inteiro = (int) valorDecimal;
		return inteiro;
	}
	
	double parteDecimal() {
		return valorDecimal  - parteInteira();
	}
}
