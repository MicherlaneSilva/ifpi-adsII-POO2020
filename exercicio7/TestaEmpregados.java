package exercicio7;

public class TestaEmpregados {
	public static void main(String args[]){
		Empregado emp = new Empregado();
		Diarista dta = new Diarista();
		Horista ht = new Horista();
		
		System.out.println("Salário empregado: R$ " + emp.calcularSalario());
		System.out.println("Salário diarista: R$ " + dta.calcularSalario());
		System.out.println("Salário horista: R$ "+ String.format("%.2f",ht.calcularSalario()));
	
	}
}
