
public class Desconto {
	float valor;
	float desconto;
	
	Desconto(float valor, float desconto){
		this.valor = valor;
		this.desconto = desconto;
	}
	
	float calcula() {
		return this.valor * (1 - this.desconto/100);
	}
}
