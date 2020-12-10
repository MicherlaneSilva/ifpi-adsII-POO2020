
public class Saudacao {
	String texto;
	String destinatario;
	
	Saudacao(String texto, String destinatario){
		this.texto = texto;
		this.destinatario = destinatario;
	}
	
	public void obterSaudacao() {
		System.out.println(this.texto + " " + this.destinatario + "!");
	}
}
