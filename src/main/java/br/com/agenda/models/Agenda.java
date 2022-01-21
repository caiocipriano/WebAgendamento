package br.com.agenda.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import br.com.agenda.enums.Servico;

@Entity
public class Agenda {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer id;
	
	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "Data")
	private String data;
	
	@Column(name = "Hora")
	private String hora;
	
    @Enumerated(EnumType.STRING)
	//@NotNull(message = "Campo Obrigatório")
	private Servico servico; 
	
}
