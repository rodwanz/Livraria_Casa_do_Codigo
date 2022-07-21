package metodologia4;

import java.util.ArrayList;
import java.util.List;

import produtos.Produto;

public class CarrinhoDeCompras {
	
	private double total;
	private List<Produto> produtos;
	
	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<Produto>();
	}
	
	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}

	public double getTotal() {
		return total;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
}
