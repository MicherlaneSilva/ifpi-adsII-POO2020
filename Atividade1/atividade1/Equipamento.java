
public class Equipamento {
	boolean ligado =  false;
	
	Equipamento(){
	
	}
	void liga() {
		if(ligado == false) {
			ligado = true;
		}
	}
	
	void desliga() {
		if(ligado == true) {
			ligado = false;
		}
	}
	void inverte() {
		if(ligado == true) {
			ligado = false;
		}else {
			ligado = true;
		}
	}
	
	void estaLigado() {
		System.out.println("Esta ligado? " + ligado);
	}
}
