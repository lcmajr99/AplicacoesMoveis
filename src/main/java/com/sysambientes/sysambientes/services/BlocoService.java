package com.sysambientes.sysambientes.services;

import com.sysambientes.sysambientes.model.Bloco;
import com.sysambientes.sysambientes.repository.BlocoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlocoService {

	@Autowired
	private BlocoRepository blocoRepository;

	public BlocoService() { }
	
	
	public <S extends Bloco> S create(S entity) {
		return blocoRepository.save(entity);
	}

	public <S extends Bloco> S update(S entity) {
		return blocoRepository.save(entity);
	}
	
	public void deleteById(Integer id) {
		blocoRepository.deleteById(id);
	}
	
	public Bloco findById(Integer id) {
		Optional<Bloco> blocoOpt = blocoRepository.findById(id);
		return blocoOpt.orElse(null);
	}
	
	public List<Bloco> findAll() {
		return blocoRepository.findAll();
	}
	
}
