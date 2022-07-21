package testes;

public class ConultaDeDescontos {

	public static void main(String[] args) {
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
		if(gerenciador.validaCupom("CUP134")) {
			System.out.println("Cupom de desconto válido");
		}
		else {
			System.out.println("Esse cupom não existe");
		}
	}
}
