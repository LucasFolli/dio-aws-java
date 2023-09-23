package exemplosAula.interfa.exemplo.equipamentos.multifuncional;

import exemplosAula.interfa.exemplo.equipamentos.copiadora.Copiadora;
import exemplosAula.interfa.exemplo.equipamentos.digitalizadora.Digitalizadora;
import exemplosAula.interfa.exemplo.equipamentos.impressora.Impressora;

// JAVA não permite herança multipla!!!!
// public class EquipamentoMultifuncional extends Impressora extends Copiadora
// As outras classes devem ser interfaces -> feito

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
	public void copiar() {
		System.out.println("Copiando via equipamento multifuncional...");		
	}
	
	public void digitalizar() {
		System.out.println("Digitalizando via equipamento multifuncional...");
	}
	
	public void imprimir() {
		System.out.println("Imprimindco via equipamento multifuncional...");
	}
	
}
