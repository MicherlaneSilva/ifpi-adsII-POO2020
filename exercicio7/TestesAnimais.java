package exercicio7;

import java.util.Scanner;

public class TestesAnimais {
	static Animal animais[] = new Animal[7];
	
	public static void main(String args[]) {
		addBovino();
		addPeixe();
		addAnimal();
		
		System.out.println("\nRelação");
		for(int i = 0; i < 7; i++) {
			if(animais[i] instanceof Animal) {
				System.out.println("Animal");
			} else if (animais[i] instanceof Bovino) {
				System.out.println("Bovino");
			}else {
				System.out.println("Peixe");
			}
		}
		
		
	}
	public static void addBovino() {
		String nome, especie;
		float qtdLeite;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bovino\nEspécie: ");
		especie = input.next();
		System.out.print("Nome: ");
		nome = input.next();
		System.out.print("Quantidade de leite: ");
		qtdLeite = input.nextFloat();
		
		for(int i = 0; i < 3; i++) {			
			Bovino b = new Bovino(especie, nome, qtdLeite);
			animais[i] = b;
		}
	}
	
	public static void addPeixe() {
		String nome, especie;
		int profundidade;
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nPeixe\nEspécie: ");
		especie = input.next();
		System.out.print("Nome: ");
		nome = input.next();
		System.out.print("Quantidade de leite: ");
		profundidade = input.nextInt();
		
		for(int i = 3; i < 5; i++) {
			
			Peixe b = new Peixe(especie, nome, profundidade);
			animais[i] = b;
		}
	}
	
	public static void addAnimal() {
		String nome, especie;
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nAnimal\nEspécie: ");
		especie = input.next();
		System.out.print("Nome: ");
		nome = input.next();
		
		for(int i = 5; i < 7; i++) {
			
			Animal b = new Animal(especie, nome);
			animais[i] = b;
		}
	}
}
