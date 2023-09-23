package exemplosAula.abstracao;

public class Computador {
	public static void main (String[] args) {
		System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("\nFacebook Messenger");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println("\nTelegram Messenger");
		TelegramMessenger tlg = new TelegramMessenger();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}

}
// Em Java, o conceito de abstração é representado pela palavra reservada **abstract**
// e métodos que NÃO possuem corpo na classe abstrata (pai). - Aula