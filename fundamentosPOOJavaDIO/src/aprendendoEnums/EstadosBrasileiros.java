package aprendendoEnums;

public enum EstadosBrasileiros {
	SAO_PAULO("SP", "São Paulo", 11),
	RIO_DE_JANEIRO("RJ", "Rio De Janeiro", 12),
	PIAUI("PI", "Piauí", 13),
	MARANHAO("MA", "Maranhão", 14),
	CEARA("CE", "Ceará", 15);
	
	private String nome;
	private String sigla;
	private Integer ibge;
	
	private EstadosBrasileiros(String sigla, String nome, Integer ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	
	public Integer getIbge() {
		return ibge;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}

}
