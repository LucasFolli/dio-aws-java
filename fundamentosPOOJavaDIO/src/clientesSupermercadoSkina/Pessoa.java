package clientesSupermercadoSkina;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	// Construtores - Toda vez que for criar nova pessoa, já tem que colocar cpf e nome.
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String novoEndereco) {
		this.endereco = novoEndereco;
	}

	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}

}
