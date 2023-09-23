package exemplosAula.polimorfismo.apps;

public class TelegramMessenger extends ServicoPrincipal {
	public void enviarMensagem() {
		validarConectadoInternet();
		
		System.out.println("Enviando mensagem pelo Telegram Messenger");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram Messenger");
	}

	public void salvarHistoricoMensagens() {
		
	}

}