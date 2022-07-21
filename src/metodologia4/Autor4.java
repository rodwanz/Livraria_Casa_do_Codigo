package metodologia4;

public class Autor4 {
	
	private String nome;
	private String email;
	private String cpf;
	
	public Autor4(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf  = cpf;
	}
	
	public Autor4() {}

	public void mostrarDetalhes() {
		System.out.println("==============");
		System.out.println("Mostrando detalhes do Autor");
		System.out.println("O nome do Autor: ".concat(getNome()));
		System.out.println("Email para contato: " .concat(email));
		System.out.println("Sua identificação: " .concat(getCpf()));
		System.out.println("==============");

	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
