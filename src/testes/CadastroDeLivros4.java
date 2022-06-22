package testes;

import metodologia4.Autor4;
import produtos.LivroFisico;
import produtos.Livros4;
import produtos.MiniLivro;

public class CadastroDeLivros4 {

	public static void main(String[] args) {
		
		Autor4 autor = new Autor4();
		autor.setNome("Murilo Alves Batista");
		autor.setEmail("murilo@gmail.com");
		autor.setCpf("098.890.456-32");
		
		Livros4 livros4 = new MiniLivro(autor);
		livros4.setNome("Java 8 Prático.");
		livros4.setDescricao("Novos recurssos da linguagem");
		livros4.setValor(67.89);
		livros4.setIsbn("978-85-66250-46-6");
		
		
		livros4.mostrarDetalhes();
		
		Autor4 outroAutor = new Autor4();
		outroAutor.setNome("Murilo Henrique Alves Batista");
		outroAutor.setEmail("muriloB@gmail.com");
		outroAutor.setCpf("098.890.456-32");
		
		Livros4 ouLivros4 = new LivroFisico(autor);
		ouLivros4.setNome("Refinando conhecimentos em Java.");
		ouLivros4.setDescricao("Metodos para melhorar seu aprendizado em Java.");
		ouLivros4.setValor(75.89);
		ouLivros4.setIsbn("789-45-78921-34-7");
		
		
		ouLivros4.mostrarDetalhes();

	}

}
