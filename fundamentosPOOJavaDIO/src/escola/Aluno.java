package escola;

/**
 * 
 * @author lucasfolli
 *
 */
public class Aluno {
	private String nome;
	private Integer idade;
	
	// getter nome
	public String getNome() {
		return nome;
	}
	// setter nome
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	// getter idade
	public Integer getIdade() {
		return idade;
	}
	// setter idade
	public void setIdade(Integer novaIdade) {
		this.idade = novaIdade;
	}
}