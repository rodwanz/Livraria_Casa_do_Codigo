package produtos;

import metodologia4.Autor4;

public class LivroFisico extends Livros4 implements Promocional{
	
	public LivroFisico(Autor4 autor) {
		super(autor);
	}
	
	public double getTaxaDeImpressao() {
		return this.getValor() * 0.05;
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.3) {
			return false;
		}
		
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		System.out.println("aplicando desconto no Livro Físico");
		return true;
	}

	@Override
	public String toString() {
		return nome
				+ "(Livro: " 
				+ descricao
				+ " Descricao: Automatizando padrões."  
				+ ")";
	}
}
