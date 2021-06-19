package com.sysambientes.sysambientes.services;

import com.sysambientes.sysambientes.model.Unidade;
import com.sysambientes.sysambientes.repository.UnidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnidadeService {

	@Autowired
	private UnidadeRepository unidadeRepository;

	public UnidadeService() { }
	
	
	public <S extends Unidade> S create(S entity) {
		return unidadeRepository.save(entity);
	}

	public <S extends Unidade> S update(S entity) {
		return unidadeRepository.save(entity);
	}
	
	public void deleteById(Integer id) {
		unidadeRepository.deleteById(id);
	}
	
	public Unidade findById(Integer id) {
		Optional<Unidade> unidadeOpt = unidadeRepository.findById(id);
		return unidadeOpt.orElse(null);
	}
	
	public List<Unidade> findAll() {
		return unidadeRepository.findAll();
	}
	
}
