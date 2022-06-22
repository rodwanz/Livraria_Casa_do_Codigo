package metodologia4;

public class Autor4 {
	
	private String nome;
	private String email;
	private String cpf;
	
	public void mostrarDetalhes() {
		System.out.println("==============");
		System.out.println("Mostrando detalhes do Autor");
		System.out.println("O nome do Autor: " + nome);
		System.out.println("Email para contato: " + email);
		System.out.println("Sua identificação: " + cpf);
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
