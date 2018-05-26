package br.com.db1.stat.classes;

public abstract class Esporte {

	private Boolean usaBola;
	private Integer tempoDeJogo;
	private String regras;

	public Boolean getUsaBola() {
		return usaBola;
	}

	public void setUsaBola(Boolean usaBola) {
		this.usaBola = usaBola;
	}

	public Integer getTempoDeJogo() {
		return tempoDeJogo;
	}

	public void setTempoDeJogo(Integer tempoDeJogo) {
		this.tempoDeJogo = tempoDeJogo;
	}

	public String getRegras() {
		return regras;
	}

	public void setRegras(String regras) {
		this.regras = regras;
	}
}
