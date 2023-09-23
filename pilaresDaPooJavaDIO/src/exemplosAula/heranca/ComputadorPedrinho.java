package exemplosAula.heranca;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		System.out.println("Usando o MSN para se comunicar");
		msn.enviarMensagem();		
		msn.receberMensagem();
		
		FacebookMessenger fbm = new FacebookMessenger();
		System.out.println("\nUsando o Facebook Messenger para se comunicar");
		fbm.enviarMensagem();
		fbm.receberMensagem();
		
		Telegram tlg = new Telegram();
		System.out.println("\nUsando o Telegram para se comunicar");
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}

}