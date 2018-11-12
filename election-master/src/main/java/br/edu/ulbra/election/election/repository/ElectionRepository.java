package br.edu.ulbra.election.election.repository;

import br.edu.ulbra.election.election.model.Election;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ElectionRepository extends CrudRepository<Election, Long> {
	Election findByYear(Integer year);
	Election findByDescription(String description);
	Election findByStateCode(String stateCode);

}