package exercicio6;

import java.util.ArrayList;

public class Estoque{
	ArrayList<Produto> produtos = new ArrayList<>();
	
	Estoque(){
	}
	
	public void inserirProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public int procurar(int id) {
		int position = -1;
		for(int i = 0; i < produtos.size(); i++) {
			if(produtos.get(i).getId() == id) {
				position = i;
			}
		}
		return position;
	}
	
	public void consultar(int id) {
		if(procurar(id) != -1) {
			produtos.get(procurar(id)).toString();
		}else {
			System.out.print("Produto não encontrado.");
		}
	
	}
	
	
	public void excluir(int id) {
			if(procurar(id) != -1) {
				produtos.remove(procurar(id));
				System.out.println("Produto removido com sucesso!");
			}else {
			System.out.print("Produto não encontrado.");
		}
	}
	
	public void darBaixaProduto(int id, int quantidade) {
		if(procurar(id) != -1) {
			produtos.get(procurar(id)).darBaixa(quantidade);
			produtos.get(procurar(id)).toString();
		}
	}
	
	public void reporEstoque(int id, int quantidade) {
		if(procurar(id) != -1) {
			produtos.get(procurar(id)).reporEstoque(quantidade);
			produtos.get(procurar(id)).toString();
		}
	}
}
