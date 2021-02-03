package sistemaBanco;

public class TestesDasClasses {
	public static void main(String args[]) {
		ContaCorrente c1 = new ContaCorrente("Penny", 100);
		ContaCorrente c2 = new ContaCorrente("Mérula", 100);
		ContaCorrente c3 = new ContaCorrente("André", 100);
		
		
		SeguroDeVida s1 = new SeguroDeVida();
		SeguroDeVida s2 = new SeguroDeVida();
		SeguroDeVida s3 = new SeguroDeVida();
		
		
		
		AuditoriaInterna ai = new AuditoriaInterna();
		
		ai.adicionar(c1);
		ai.adicionar(c2);
		ai.adicionar(c3);
		
		ai.adicionar(s1);
		ai.adicionar(s2);
		ai.adicionar(s3);
		
		System.out.print("Total tributos R$ " + ai.calcularTributos());;
				
	}
}
