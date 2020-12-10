
public class TesteDecimalNumber {

	public static void main(String[] args) {
		DecimalNumber dn = new DecimalNumber(17.56);
		System.out.println("Parte decimal: "+dn.parteDecimal());
		System.out.println("Parte inteira: " + dn.parteInteira());

	}

}
