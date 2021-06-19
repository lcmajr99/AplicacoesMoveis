package com.sysambientes.sysambientes.services;

import com.sysambientes.sysambientes.model.Regional;
import com.sysambientes.sysambientes.repository.RegionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionalService {

	@Autowired
	private RegionalRepository regionalRepository;

	public RegionalService() { }
	
	
	public <S extends Regional> S create(S entity) {
		return regionalRepository.save(entity);
	}

	public <S extends Regional> S update(S entity) {
		return regionalRepository.save(entity);
	}
	
	public void deleteById(Integer id) {
		regionalRepository.deleteById(id);
	}
	
	public Regional findById(Integer id) {
		Optional<Regional> regionalOpt = regionalRepository.findById(id);
		return regionalOpt.orElse(null);
	}
	
	public List<Regional> findAll() {
		return regionalRepository.findAll();
	}
	
}
