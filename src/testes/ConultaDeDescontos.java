package testes;

public class ConultaDeDescontos {

	public static void main(String[] args) {
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
		if(gerenciador.validaCupom("CUP134")) {
			System.out.println("Cupom de desconto v�lido");
		}
		else {
			System.out.println("Esse cupom n�o existe");
		}
	}
}
