package exercicio5;

import java.util.Scanner;

public class TestaHora {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int opc;
		String h, m, s;
		String opcao = " ";
		
		do {
			System.out.print("\n\n1 - Preencher formato hh:mm:ss\n2 - Preencher somente h/m/s\n\nOpção: ");
			opcao = input.next();
			switch(opcao) {
			case "1":
				System.out.print("\nHora: ");
				h = input.next();
				System.out.print("Minuto: ");
				m = input.next();
				System.out.print("Segundo: ");
				s = input.next();
				Hora hora = new Hora(h, m, s);
				System.out.println(hora.toString());
				break;
			case "2":
				Hora hora1 = new Hora();
				System.out.print("\n1 - hora\n2 - minuto\n3 - segundos\n\nOpção");
				opc = input.nextInt();
				if(opc == 1) {
						System.out.print("\nHora: ");
						h = input.next();
						hora1.setHora(h);
				}
			    else if(opc == 2) {
						System.out.print("\nMinuto: ");
						m = input.next();
						hora1.setMinuto(m);
			    }
			    else if(opc == 3) {
						System.out.print("\nSegundo: ");
						s = input.next();
						hora1.setSegundo(s);
				}
				System.out.println(hora1.toString());
			}
		}while(opcao != "3");
		
	}
}
