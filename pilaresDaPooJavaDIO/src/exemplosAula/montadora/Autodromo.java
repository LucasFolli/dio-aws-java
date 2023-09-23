package exemplosAula.montadora;

public class Autodromo {
	public static void main (String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("848415");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("423318");
		z400.ligar();
	}

}
