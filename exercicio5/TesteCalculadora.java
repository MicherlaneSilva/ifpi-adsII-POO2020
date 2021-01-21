package exercicio5;
import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String opcao = " ", enter;
		float operando1, operando2;
		
		System.out.print("Operando 1: ");
		operando1 = input.nextFloat();
		
		System.out.print("Operando 2: ");
		operando2 = input.nextFloat();
		
		Calculadora calc = new Calculadora(operando1, operando2);
		
		String msg = "\n\n1 - Somar \n2 - Subtrair "
				+ "\n3 - Multiplicar \n4 - Dividir \n5 - Sair\nOpção: ";
		
		do {
			System.out.print(msg);
			opcao = input.next();
			
			switch(opcao) {
				case "1":
					System.out.println("SOMA");
					System.out.print(calc.getOperando1()+ " + " + calc.getOperando2() + " = " + calc.somar());
					break;
				case "2":
					System.out.println("SUBTRAÇÃO");
					System.out.print(calc.getOperando1()+ " - " + calc.getOperando2() + " = " + calc.subtrair());
					break;
				case "3":
					System.out.println("MULTIPLICAÇÃO");
					System.out.print(calc.getOperando1()+ " * " + calc.getOperando2() + " = " + calc.multiplicar());
					break;
				case "4":
					System.out.println("DIVISÃO");
					System.out.print(calc.getOperando1()+ " / " + calc.getOperando2() + " = " + calc.dividir());
					break;
					
				default:
					System.out.println("Opção inválida");
					break;
			}
		
		}while(opcao != "5");
	}

}
