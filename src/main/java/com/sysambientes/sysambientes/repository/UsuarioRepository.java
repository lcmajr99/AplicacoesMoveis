package com.sysambientes.sysambientes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sysambientes.sysambientes.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	public Optional<Usuario> findById(Integer id);
	
	public boolean existsById(Integer id);
	
	public List<Usuario> findAll();
	
	public <S extends Usuario> S save(S entity);
	
	public void deleteById(Integer id);

}
