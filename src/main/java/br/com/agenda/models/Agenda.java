package br.com.agenda.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	@NotNull(message = "Campo Obrigatório")
	private Servico servico;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	} 
	
    
}
