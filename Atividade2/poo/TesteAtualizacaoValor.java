package poo;

public class TesteAtualizacaoValor {

	public static void main(String[] args) {
		AtualizacaoDeValor v = new AtualizacaoDeValor();
		v.x(20);
		v.x(18);
		System.out.println(v.valor);
}

}
