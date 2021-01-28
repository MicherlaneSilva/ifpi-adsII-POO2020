package exercicio7;

public class Professor extends Funcionario{
	private String titulacao;
	
	Professor(String nome, String sobrenome, int matricula, double salario, String titulacao){
		super(nome, sobrenome, matricula, salario);
		this.titulacao = titulacao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public double getSalarioPrimeiraParcela() {
		return getSalario();
	}
	
	public double getSalarioSegundaParcela() {
		return 0;
	}
	
	public String toString() {
		return super.toString() + "\nTitulacao: " + getTitulacao();
	}
	
	
	
}
