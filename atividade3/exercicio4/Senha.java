package exercicio4;

public class Senha {
	String valor;
	
	Senha(String valor){
		this.valor = valor;
	}
	
	boolean ehIgual(String valor) {
		return this.valor.equals(valor);
	}
	
	boolean ehIgualTrim(String valor) {
		return this.valor.equals(valor.trim());
	}
	
	boolean tamanhoSeguro() {
		return this.valor.length() >= 6;
	}
	
	boolean temMaiuscula() {
		for(int i = 0; i< this.valor.length(); i++ ) {
			if((this.valor.charAt(i)>= 'A') && (this.valor.charAt(i)<='Z')) {
				return true;
			}
		}return false;
	}
	
	boolean temMinuscula() {
		for(int i = 0; i< this.valor.length(); i++ ) {
			if((this.valor.charAt(i)>= 'a') && (this.valor.charAt(i)<='z')) {
				return true;
			}
		}return false;
	}
	
	boolean possuiMaiusculaMinuscula() {
		return temMaiuscula() && temMinuscula();
	}
	
	boolean ehNumero(char c) {
		for(int i = 0; i<10; i++) {
			char d = (char) i;
			if(d == i) {
				return true;
			}
		}return false;
		
	}
	
	boolean possuiNumero() {
		for(int i = 0; i < this.valor.length(); i++) {
			if(ehNumero(this.valor.charAt(i))){
				return true;
			}
		}
		return false;
	}
	
	boolean ehValida() {
		return possuiMaiusculaMinuscula() && possuiNumero() && tamanhoSeguro();
	}
}
