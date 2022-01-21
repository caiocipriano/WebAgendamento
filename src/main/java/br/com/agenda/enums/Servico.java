package br.com.agenda.enums;

public enum Servico {
	
	DESIGN("Design Sobramcelhas"),
	
	MICRO("MicroPigmentação");
	
	private String servico;
	
	private Servico(String servico) {
		this.servico= servico;
	}
}
