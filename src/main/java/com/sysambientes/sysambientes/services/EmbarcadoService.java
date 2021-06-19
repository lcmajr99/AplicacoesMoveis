package com.sysambientes.sysambientes.services;

import com.sysambientes.sysambientes.model.Embarcado;
import com.sysambientes.sysambientes.repository.EmbarcadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmbarcadoService {

	@Autowired
	private EmbarcadoRepository embarcadoRepository;

	public EmbarcadoService() { }
	
	
	public <S extends Embarcado> S create(S entity) {
		return embarcadoRepository.save(entity);
	}

	public <S extends Embarcado> S update(S entity) {
		return embarcadoRepository.save(entity);
	}
	
	public void deleteById(Integer id) {
		embarcadoRepository.deleteById(id);
	}
	
	public Embarcado findById(Integer id) {
		Optional<Embarcado> embarcadoOpt = embarcadoRepository.findById(id);
		return embarcadoOpt.orElse(null);
	}
	
	public List<Embarcado> findAll() {
		return embarcadoRepository.findAll();
	}
	
}
