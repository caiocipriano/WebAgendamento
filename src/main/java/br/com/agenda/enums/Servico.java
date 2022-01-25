package br.com.agenda.enums;

public enum Servico {
	
	Design("Design Sobramcelhas"),
	
	MicroPigmentação("MicroPigmentação");
	
	private String servico;
	
	private Servico(String servico) {
		this.servico= servico;
	}
}
