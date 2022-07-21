package produtos;

import metodologia4.Autor4;

public class Ebook extends Livros4 implements Promocional{
		
		private String waterMark;
		
		public Ebook(Autor4 autor4) {
			super(autor4);
		}
		
		public void setWaterMark(String waterMark) {
			this.waterMark = waterMark;
		}
		
		public String getwaterMark() {
			return waterMark;
		}
		
		@Override
		public boolean aplicaDescontoDe(double porcentagem) {
			if(porcentagem > 0.15) {
				return false;
			}			
			
			double desconto = this.getValor() * porcentagem;
			this.setValor(this.getValor() - desconto);
			System.out.println("aplicando desconto no Ebook");
			return true;
			
		}

		@Override
		public String toString() {
			return getNome()
					+ "(Livro: " 
					+ getDescricao()
					+ " Descricao: Superando complexos."  
					+ ")";
		}
}
