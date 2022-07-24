package testes;

import java.util.HashSet;

public class ConultaDeDescontos {

	public static void main(String[] args) {
		
		GerenciadorDeCupons3 gerenciador = new GerenciadorDeCupons3();
		
		Double desconto = gerenciador.validaCupom("CUP74");
		
		if(desconto != null) {
			System.out.println("Cupom de desconto válido");
			System.out.println("Valor " + desconto);
		}
		else {
			System.out.println("Esse cupom não existe");
		}
		///*
		HashSet<String> set = new HashSet<String>();
		set.add("Não há repetição em Conjuntos");
		set.add("Não há repetição em Conjuntos");
		set.add("Não há repetição em Conjuntos");
		set.add("Não há repetição em Conjuntos");
		set.add("Não há repetição em Conjuntos");
		System.out.println(set.size());
		//*/
	}
}
