package br.com.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agenda.models.Agenda;

public interface AgendaDAO extends JpaRepository<Agenda, Integer> {
	
	Agenda findById(long Id);
	
}
