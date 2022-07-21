package testes;

import metodologia4.Autor4;
import produtos.LivroFisico;
import produtos.Livros4;
import produtos.MiniLivro;

public class CadastroDeLivros4 {

	public static void main(String[] args) {
		
		Autor4 autor = new Autor4("Murilo Batista", "murilobatista@gmail.com","098.890.456-32");
		
		Livros4 livros4 = new MiniLivro(autor);
		livros4.setNome("Java 8 Prático.");
		livros4.setDescricao("Novos recurssos da linguagem");
		livros4.setValor(67.89);
		livros4.setIsbn("978-85-66250-46-6");		
		
		livros4.mostrarDetalhes();
		
		Autor4 outroAutor = new Autor4("Murilo Henrique", "murilohen@gmail.com","798.120.456-32");
		
		Livros4 outroLivros4 = new LivroFisico(outroAutor);
		outroLivros4.setNome("Refinando conhecimentos em Java.");
		outroLivros4.setDescricao("Metodos para melhorar seu aprendizado em Java.");
		outroLivros4.setValor(75.89);
		outroLivros4.setIsbn("789-45-78921-34-7");		
		
		outroLivros4.mostrarDetalhes();
		
		Autor4 ouAutor = new Autor4("Nillander Rocha", "nillRock@gmail.com","018.590.456-02");
		
		Livros4 ouLivros4 = new LivroFisico(ouAutor);
		ouLivros4.setNome("Arquitetura de Software em Java.");
		ouLivros4.setDescricao("Seus padrões e avanços.");
		ouLivros4.setValor(75.89);
		ouLivros4.setIsbn("777-45-78931-31-7");		
		
		ouLivros4.mostrarDetalhes();
		
		Autor4 proxAutor = new Autor4("Matheus Loose", "ml.agora@gmail.com","028.800.426-02");
		
		Livros4 proxLivros4 = new LivroFisico(proxAutor);
		proxLivros4.setNome("Arrebentando em Java.");
		proxLivros4.setDescricao("Criando ações automatas em Java.");
		proxLivros4.setValor(75.89);
		proxLivros4.setIsbn("789-45-78921-34-7");		
		
		proxLivros4.mostrarDetalhes();

	}

}
