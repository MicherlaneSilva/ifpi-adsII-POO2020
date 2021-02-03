package classesAbstratas;

public class Gerente extends Funcionario {
	private int perParticipacao;
	
	public Gerente(double salario, int perParticipacao) {
		this.salario = salario;
		this.perParticipacao = perParticipacao;
		
	}
	
	public double getBonificacao() {
		return this.salario + this.salario * this.perParticipacao / 100;
	}

	public int getPerParticipacao() {
		return perParticipacao;
	}

	public void setPerParticipacao(int perParticipacao) {
		this.perParticipacao = perParticipacao;
	}
	
	
}
