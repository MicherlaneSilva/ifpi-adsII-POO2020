package exercicio5;

public class Hora {
	private String hora = "00";
	private String minuto = "00";
	private String segundo = "00";
	
	Hora(){
		
	}
	
	Hora(String hora, String minuto, String segundo){
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getMinuto() {
		return minuto;
	}

	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}

	public String getSegundo() {
		return segundo;
	}

	public void setSegundo(String segundo) {
		this.segundo = segundo;
	}

	
	public String toString() {
		return getHora() + ":" + getMinuto() + ":" + getSegundo();
	}
	
	
	
	
}

