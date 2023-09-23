package exemplosAula.interfa.exemplo.estabelecimento;

import exemplosAula.interfa.exemplo.equipamentos.copiadora.Copiadora;
import exemplosAula.interfa.exemplo.equipamentos.digitalizadora.Digitalizadora;
import exemplosAula.interfa.exemplo.equipamentos.impressora.Deskjet;
import exemplosAula.interfa.exemplo.equipamentos.impressora.Impressora;
import exemplosAula.interfa.exemplo.equipamentos.impressora.Laserjet;
import exemplosAula.interfa.exemplo.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main (String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
