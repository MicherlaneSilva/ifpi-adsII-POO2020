
public class NumberUtils {
	int n;
	NumberUtils(int n){
		this.n = n;
	}
	
	boolean isPair() {
		return this.n % 2 == 0;
	}
	
	boolean isPrime() {
		int contDivisores = 0;
		for(int i = 2; i < this.n; i++) {
			if(this.n % i == 0) {
				contDivisores ++;
			}
			if (contDivisores == 2) {
				return false;
			}
		}return true;
	}
	
	String printCount() {
		String resultado = "", stringNumero;
		for(int i = 0; i < this.n; i++ ) {
			stringNumero = ""+ i;
			resultado += stringNumero;
			resultado += ", ";
		}
		return resultado;
	}
	
	String printReverseCount() {
		String resultado = "", stringNumero;
		for(int i = n; i > 0; i-- ) {
			stringNumero = ""+ i;
			resultado += stringNumero;
			resultado += ", ";
		}
		return resultado;
	}
}
