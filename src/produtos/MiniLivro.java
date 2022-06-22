package produtos;

import metodologia4.Autor4;

public class MiniLivro extends Livros4{
	
	public MiniLivro(Autor4 autor) {
		super(autor);
	}
		
	public boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}
}
