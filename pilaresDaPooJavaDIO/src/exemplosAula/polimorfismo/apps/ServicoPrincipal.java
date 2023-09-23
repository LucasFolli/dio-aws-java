package exemplosAula.polimorfismo.apps;

public abstract class ServicoPrincipal {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	public abstract void salvarHistoricoMensagens();
	
	// "Somente os filhos conhecem este método"
	protected void validarConectadoInternet() {
		System.out.println("Verificando conexão com a Internet...");
	}
}
// Mas fica a reflexão do que já aprendemos sobre visibilidade
// de recursos: Com o modificador **private**somente a classe
// conhece a implementação, quanto que o modificador **public**
// todos passarão a conhecer. Mas gostaríamos que, somente as
// classes filhas soubessem. Bem, é ai que entra o modificador 'protected'