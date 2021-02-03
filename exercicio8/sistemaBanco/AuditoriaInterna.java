package sistemaBanco;

import java.util.ArrayList;

public class AuditoriaInterna {
	ArrayList <Tributavel> tributaveis = new ArrayList();
	
	public void adicionar(Tributavel tributavel) {
		tributaveis.add(tributavel);
	}
	
	public double calcularTributos() {
		double somaTributos = 0;
		for(int i = 0; i < tributaveis.size(); i++) {
			somaTributos += tributaveis.get(i).calcularTributos();
		}
		return somaTributos;
	}
	
}
