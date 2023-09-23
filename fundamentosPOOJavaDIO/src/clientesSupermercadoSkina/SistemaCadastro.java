package clientesSupermercadoSkina;

public class SistemaCadastro {
	public static void main (String[] args) {
		Pessoa Marcos = new Pessoa("444.444.444.4", "Marcos");
		Marcos.setEndereco("Rua A, 123");
		
		System.out.println("O vencendor do sorteio é: " + Marcos.getNome() + 
						   ", com CPF: " + Marcos.getCpf());
	}
}
