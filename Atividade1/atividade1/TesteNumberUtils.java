
public class TesteNumberUtils {

	public static void main(String[] args) {
		NumberUtils nu = new NumberUtils(2);
		System.out.println("Par? " + nu.isPair());
		System.out.println("Primo? " + nu.isPrime());
		System.out.println(nu.printCount());
		System.out.println(nu.printReverseCount());
		

	}

}
