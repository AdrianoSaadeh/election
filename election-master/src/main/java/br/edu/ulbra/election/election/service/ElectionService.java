package br.edu.ulbra.election.election.service;

import br.edu.ulbra.election.election.exception.GenericOutputException;
import br.edu.ulbra.election.election.input.v1.ElectionInput;
import br.edu.ulbra.election.election.model.Election;
import br.edu.ulbra.election.election.output.v1.ElectionOutput;
import br.edu.ulbra.election.election.output.v1.GenericOutput;
import br.edu.ulbra.election.election.repository.ElectionRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class ElectionService {
	private final ElectionRepository electionRepository;
	private final ModelMapper modelMapper;

	private static final String MESSAGE_INVALID_ID = "Invalid id";
	private static final String MESSAGE_ELECTION_NOT_FOUND = "Election not found";

	@Autowired
	public ElectionService(ElectionRepository electionRepository, ModelMapper modelMapper) {
		this.electionRepository = electionRepository;
		this.modelMapper = modelMapper;
	}

	public List<ElectionOutput> getAll() {
		Type electionOutputListType = new TypeToken<List<ElectionOutput>>() {
		}.getType();
		return modelMapper.map(electionRepository.findAll(), electionOutputListType);
	}

	public ElectionOutput create(ElectionInput electionInput) {
		validateInput(electionInput);
		Election election = modelMapper.map(electionInput, Election.class);
		election = electionRepository.save(election);
		return modelMapper.map(election, ElectionOutput.class);
	}

	public ElectionOutput getById(Long electionId) {
		if (electionId == null)
			throw new GenericOutputException(MESSAGE_INVALID_ID);

		Election election = electionRepository.findById(electionId).orElse(null);
		if (election == null)
			throw new GenericOutputException(MESSAGE_ELECTION_NOT_FOUND);

		return modelMapper.map(election, ElectionOutput.class);
	}

	public ElectionOutput update(Long electionId, ElectionInput electionInput) {
		if (electionId == null) {
			throw new GenericOutputException(MESSAGE_INVALID_ID);
		}
		validateInput(electionInput);

		Election election = electionRepository.findById(electionId).orElse(null);
		if (election == null) {
			throw new GenericOutputException(MESSAGE_ELECTION_NOT_FOUND);
		}

		election.setYear(electionInput.getYear());
		election.setStateCode(electionInput.getStateCode());
		election.setDescription(electionInput.getDescription());
		election = electionRepository.save(election);

		return modelMapper.map(election, ElectionOutput.class);
	}

	public GenericOutput delete(Long electionId) {
		if (electionId == null) {
			throw new GenericOutputException(MESSAGE_INVALID_ID);
		}

		Election election = electionRepository.findById(electionId).orElse(null);
		if (election == null) {
			throw new GenericOutputException(MESSAGE_ELECTION_NOT_FOUND);
		}

		electionRepository.delete(election);

		return new GenericOutput("Election deleted");
	}

	public List<ElectionOutput> getByYear(Integer year) {
		Type electionOutputListType = new TypeToken<List<ElectionOutput>>() {
		}.getType();
		List<Election> electionsOfTheYear = new ArrayList<>();

		for (Election election : electionRepository.findAll()) {
			if (election.getYear().equals(year))
				electionsOfTheYear.add(election);
		}

		return modelMapper.map(electionsOfTheYear, electionOutputListType);
	}

	private void validateInput(ElectionInput input) {
		if (input.getYear() != null && input.getYear() < 0)
			throw new GenericOutputException("Invalid year");
		
		//valida ano de 2000 até 2200
		if (input.getYear() < 2000 || input.getYear() > 2200)
			throw new GenericOutputException("Invalid year");

		if (input.getStateCode() != null && input.getStateCode().length() != 2)
			throw new GenericOutputException("Invalid statecode");
		
		//valida estados do BR
		if (input.getStateCode() != "AC" || 
			input.getStateCode() != "AL" || 
			input.getStateCode() != "AP" || 
			input.getStateCode() != "AM" || 
			input.getStateCode() != "BA" || 
			input.getStateCode() != "CE" || 
			input.getStateCode() != "DF" || 
			input.getStateCode() != "ES" || 
			input.getStateCode() != "GO" || 
			input.getStateCode() != "MA" || 
			input.getStateCode() != "MT" || 
			input.getStateCode() != "MS" || 
			input.getStateCode() != "MG" || 
			input.getStateCode() != "PA" || 
			input.getStateCode() != "PB" || 
			input.getStateCode() != "PR" || 
			input.getStateCode() != "PE" || 
			input.getStateCode() != "PI" || 
			input.getStateCode() != "RJ" || 
			input.getStateCode() != "RN" || 
			input.getStateCode() != "RS" || 
			input.getStateCode() != "RO" || 
			input.getStateCode() != "RR" || 
			input.getStateCode() != "SC" || 
			input.getStateCode() != "SP" || 
			input.getStateCode() != "SE" || 
			input.getStateCode() != "TO")
			throw new GenericOutputException("Invalid statecode");	
		
		//ajuste para validar descrição maior do que 5 caracteres
		if (input.getDescription() != null && input.getDescription().isEmpty() && input.getDescription().length() < 5)
			throw new GenericOutputException("Should provide a description greater than 5 characters");
	}

}
