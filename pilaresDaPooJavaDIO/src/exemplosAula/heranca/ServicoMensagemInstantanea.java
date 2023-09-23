package exemplosAula.heranca;

public class ServicoMensagemInstantanea {
	public void enviarMensagem() {
		// Connect
		validarConectadoInternet();
		// Send message
		System.out.println("Enviando mensagem");
		// Saves history
		salvarHistoricoMensagens();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado à internet");
	}
	
	private void salvarHistoricoMensagens() {
		System.out.println("Salvando o histórico de mensagens");
	}

}