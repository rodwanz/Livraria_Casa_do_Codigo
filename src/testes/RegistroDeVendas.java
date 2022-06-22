package testes;

import metodologia4.Autor4;
import metodologia4.CarrinhoDeCompras;
import produtos.Ebook;
import produtos.LivroFisico;
import produtos.Produto;

public class RegistroDeVendas {

	public static void main(String[] args) {
		
		Autor4 autor = new Autor4();
		autor.setNome("Murilo Henrique Alves Batista");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Refinando conhecimentos em Java.");
		fisico.setValor(69.89);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Refinando conhecimentos em Java.");
		ebook.setValor(34.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total " + carrinho.getTotal());
		
		Produto[] produtos = ((CarrinhoDeCompras) carrinho).getProdutos();
		
		for(int i = 0; i < produtos.length; i++) {
			try {
				Produto produto = produtos[i];
				if(produto != null) {
					System.out.println(produto.getValor());
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("deu exception no indice: " + i);
			}
		}
		
		System.out.println("Fui executado!");
	}
}
