package testes;

import java.util.HashSet;

public class ConultaDeDescontos {

	public static void main(String[] args) {
		
		GerenciadorDeCupons3 gerenciador = new GerenciadorDeCupons3();
		
		Double desconto = gerenciador.validaCupom("CUP74");
		
		if(desconto != null) {
			System.out.println("Cupom de desconto v�lido");
			System.out.println("Valor " + desconto);
		}
		else {
			System.out.println("Esse cupom n�o existe");
		}
		///*
		HashSet<String> set = new HashSet<String>();
		set.add("N�o h� repeti��o em Conjuntos");
		set.add("N�o h� repeti��o em Conjuntos");
		set.add("N�o h� repeti��o em Conjuntos");
		set.add("N�o h� repeti��o em Conjuntos");
		set.add("N�o h� repeti��o em Conjuntos");
		System.out.println(set.size());
		//*/
	}
}
