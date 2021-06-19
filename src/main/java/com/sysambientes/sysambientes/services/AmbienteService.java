package com.sysambientes.sysambientes.services;

import com.sysambientes.sysambientes.model.Ambiente;
import com.sysambientes.sysambientes.repository.AmbientelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AmbienteService {

	@Autowired
	private AmbientelRepository ambientelRepository;

	public AmbienteService() { }
	
	
	public <S extends Ambiente> S create(S entity) {
		return ambientelRepository.save(entity);
	}

	public <S extends Ambiente> S update(S entity) {
		return ambientelRepository.save(entity);
	}
	
	public void deleteById(Integer id) {
		ambientelRepository.deleteById(id);
	}
	
	public Ambiente findById(Integer id) {
		Optional<Ambiente> ambienteOpt = ambientelRepository.findById(id);
		return ambienteOpt.orElse(null);
	}
	
	public List<Ambiente> findAll() {
		return ambientelRepository.findAll();
	}
	
}
