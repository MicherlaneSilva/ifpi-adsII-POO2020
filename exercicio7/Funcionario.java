package exercicio7;

public class Funcionario extends Pessoa{
	private int matricula;
	private double salario;
	
	Funcionario(String nome, String sobrenome, int matricula, double salario){
		super(nome, sobrenome);
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}
	
	public double getSalarioPrimeiraParcela() {
		return 0.6 * getSalario();
	}
	
	public double getSalarioSegundaParcela() {
		return 0.4 * getSalario();
	}

	@Override
	public String toString() {
		return "Funcionario" + 
				"\nNome: " + super.getNomeCompleto() +
				"\nMatricula: " + getMatricula() + 
				",\nSalario inegral: R$ " + getSalario();
	}
	
	
	
}
