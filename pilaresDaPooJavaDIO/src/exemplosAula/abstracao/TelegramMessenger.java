package exemplosAula.abstracao;

public class TelegramMessenger extends ServicoPrincipal {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Telegram Messenger");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram Messenger");
	}

}
