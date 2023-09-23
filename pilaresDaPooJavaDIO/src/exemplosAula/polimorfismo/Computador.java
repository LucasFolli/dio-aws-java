package exemplosAula.polimorfismo;

import exemplosAula.polimorfismo.apps.FacebookMessenger;
import exemplosAula.polimorfismo.apps.MSNMessenger;
import exemplosAula.polimorfismo.apps.ServicoPrincipal;
import exemplosAula.polimorfismo.apps.TelegramMessenger;

public class Computador {
	public static void main (String[] args) {
		ServicoPrincipal smi = null;
		/*
		 * Não se sabe qual app,
		 * mas qualquer um deverá enviar e receber mensagem
		 */
		String appEscolhido = "msn";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("telegram"))
			smi = new TelegramMessenger();
		else if(appEscolhido.equals("facebook"))
			smi = new FacebookMessenger();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}

}

// Na programação orientada a objetos, o polimorfismo permite que referências
// de tipos de classes mais abstratas representem o comportamento das classes
// concretas que referenciam. Assim, é possível tratar vários tipos de maneira
// homogênea (através da interface do tipo mais abstrato). O termo polimorfismo
// é originário do grego e significa "muitas formas" (poli = muitas, morphos = formas). -Wikipedia