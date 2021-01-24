package exercicio6;

public class CarroEletrico extends Veiculo{
	private int autonomiaBateria;
	
	CarroEletrico(String placa, int ano, int modelo, int autonomiaBateria){
		super(placa, ano, modelo);
		this.autonomiaBateria = autonomiaBateria;
	}
	
	public int getAutonomiaBateria() {
		return this.autonomiaBateria;
	}
	
	public void setAutonomiaBateria(int autonomiaBateria) {
		this.autonomiaBateria = autonomiaBateria;
	}

	@Override
	public String toString() {
		return "Carro Elétrico\n" + super.toString() + "\nautonomiaBateria: " + autonomiaBateria;
	}
	
	
}
