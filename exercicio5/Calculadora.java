package exercicio5;

/*3. Crie uma classe Calculadora que tenha dois atributos privados (operando1 e 2) e:
a. Crie 2 métodos públicos, cada um representando uma operação básica;
b. Crie um construtor onde são passados os operandos;
c. Crie uma classe que teste a classe calculadora. Tente acessar os atributos
diretamente e verifique o que acontece.*/

public class Calculadora {
	private float operando1 = 0;
	private float operando2 = 0;
	
	Calculadora(float operando1, float operando2){
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	float somar() {
		return this.operando1 + this.operando2;
	}
	
	float multiplicar() {
		return this.operando1 * this.operando2;
	}
	
	float dividir() {
		if (this.operando2 != 0) {
			return this.operando1 / this.operando2;
		}else {
			return 0;
		}
		
	}
	float subtrair() {
		return this.operando1 - this.operando2;
	}

	public float getOperando1() {
		return operando1;
	}

	public void setOperando1(float operando1) {
		this.operando1 = operando1;
	}

	public float getOperando2() {
		return operando2;
	}

	public void setOperando2(float operando2) {
		this.operando2 = operando2;
	}
	
}
