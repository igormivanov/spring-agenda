package br.com.agenda.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agenda.models.PacienteModel;
import br.com.agenda.repositories.PacienteRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	public PacienteModel save(PacienteModel pacienteModel) {
		return pacienteRepository.save(pacienteModel);
	}
	
	public List<PacienteModel> listAll(){
		return pacienteRepository.findAll();
	}
	
	public Optional<PacienteModel> findById(Long id) {
		return pacienteRepository.findById(id);
	}
	
	public void delete(PacienteModel paciente) {
		pacienteRepository.delete(paciente);
	}
}
