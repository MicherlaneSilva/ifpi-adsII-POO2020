package poo;

public class Teste {
	
	int b = 1;
	int a;
	
	Teste(int a){
		a = b + a;
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		Teste t = new Teste(2);
	}

}
