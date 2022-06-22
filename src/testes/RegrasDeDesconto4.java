package testes;

import metodologia4.Autor4;
import produtos.Ebook;
import produtos.LivroFisico;

public class RegrasDeDesconto4 {

	public static void main(String[] args) {

		Autor4 autor = new Autor4();
		autor.setNome("Murilo Alves Batista");
		
		LivroFisico livros4 = new LivroFisico(autor);
		livros4.setValor(67.89);

		System.out.println("Valor atual : " + livros4.getValor());

		if (!livros4.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto não pode ser maior que 30%");
		} else {
			System.out.println("Valor com desconto: " + livros4.getValor());
		}

		Ebook ebook = new Ebook(autor);
		ebook.setValor(32.75);

		if (!livros4.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto não pode ser maior que 15%");
		} else {
			System.out.println("Valor do Ebbok com desconto: " + livros4.getValor());
		}
	}

}
