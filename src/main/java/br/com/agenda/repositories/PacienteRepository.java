package br.com.agenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.agenda.models.PacienteModel;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteModel, Long>{

}
