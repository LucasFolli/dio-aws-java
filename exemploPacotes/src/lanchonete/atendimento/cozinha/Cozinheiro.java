package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	
	// Pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionando lanche natural hambúrger no balcão");
	}
	
	// Pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionando suco no balcão");
	}
	
	// Pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	private void prepararLanche() {
		System.out.println("Preparando lanche tipo hambúrger");
	}
	
	private void prepararVitamina() {
		System.out.println("Preparando Vitamina");
	}
	
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	private void selecionarIngredientesLanche() {
		System.out.println("Selecionado o pão, salada, ovo e carne");
	}
	
	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionado fruta, leite e suco");
	}
	
	private void lavarIngredientes() {
		System.out.println("Lavando ingredientes");
	}
	
	private void baterVitaminaLiquidificador() {
		System.out.println("Batendo vitamina no liquidificador");
	}
	
	private void fritarIngredientesLanche() {
		System.out.println("Fritando a carne e o ovo para o Hambúrger");
	}
	
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}

}
