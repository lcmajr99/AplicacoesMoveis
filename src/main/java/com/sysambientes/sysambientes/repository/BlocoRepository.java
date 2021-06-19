package com.sysambientes.sysambientes.repository;


import com.sysambientes.sysambientes.model.Bloco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface BlocoRepository extends JpaRepository<Bloco, Integer> {

	public	Optional<Bloco> findById(Integer id);

	public	boolean existsById(Integer id);

	public	List<Bloco> findAll();

	public	<S extends Bloco> S save(S entity);

	public	void deleteById(Integer id);

}
