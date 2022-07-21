package produtos;

import exception.AutorNuloException;
import metodologia4.Autor4;

public abstract class Livros4 implements Produto{
	
	protected String nome;
	protected String descricao;
	protected String isbn;
	protected double valor;
	protected Autor4 autor;
	
	public Livros4() {}
	
	public Livros4(Autor4 autor) {
		if(autor == null) {
			throw new AutorNuloException("O Autor do Livro pode ser nulo");
		}
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}
	
	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro");
		System.out.println("O nome do livro é: " + nome);
		System.out.println("Sua descricao: " + descricao);
		System.out.println("O ISBN é: " + isbn);
		System.out.println("Valor deste livro = " + valor);

		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}

		System.out.println("==============");

	}
	
	boolean temAutor() {
		return this.autor != null;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Autor4 getAutor() {
		return autor;
	}
	public void setAutor(Autor4 autor) {
		this.autor = autor;
	}
	
	@Override
	public int compareTo(Produto outro) {
		
		return (int) (this.getValor() - outro.getValor());
	}
}
