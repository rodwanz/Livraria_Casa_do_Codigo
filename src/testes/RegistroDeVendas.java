package testes;

import java.util.List;

import metodologia4.Autor4;
import metodologia4.CarrinhoDeCompras;
import produtos.Ebook;
import produtos.LivroFisico;
import produtos.Produto;

public class RegistroDeVendas {

	public static void main(String[] args) {
		
		Autor4 autor = new Autor4();
		autor.setNome("Murilo Batista");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Padrões de Projeto em Java.");
		fisico.setValor(69.89);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Algoritmos complexos em Java.");
		ebook.setValor(34.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		if(fisico.aplicaDescontoDe(0.1)) {
			System.out.println("Valor agora é " + fisico.getValor());
		}
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total " + carrinho.getTotal());
		
		List<Produto> produtos = carrinho.getProdutos();
		
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
