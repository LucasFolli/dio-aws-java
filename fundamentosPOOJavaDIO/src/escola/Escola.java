package escola;

public class Escola {
	public static void main (String[] args) {
		// Criando objeto
		Aluno felipe = new Aluno();
		// Inserindo os valores dos atributos desse objeto
		felipe.setNome("Felipe");
		felipe.setIdade(300);
		
		// Concatenação do método para exibição de uma mensagem no console
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
	}

}
