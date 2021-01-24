package exercicio6;

public class Produto {
	private int id;
	private String descricao;
	private int quantidade;
	private double valor;
	
	static int contId = 1;
	
	Produto(String descricao, int quantidade, double valor){
		this.id = contId;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
		
		contId++;
	}
	
	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public void reporEstoque(int quantReposicao) {
		this.setQuantidade(this.getQuantidade() + quantReposicao);
	}
	
	public void darBaixa(int quantidade) {
		this.setQuantidade(this.getQuantidade() - quantidade);
	}

	@Override
	public String toString() {
		return    "ID: " + id 
				+ "\nDescrição: " + descricao 
				+ "\nQuantidade: " + quantidade 
				+ "\nValor: " + valor;
	}
	
	
	
	
}
