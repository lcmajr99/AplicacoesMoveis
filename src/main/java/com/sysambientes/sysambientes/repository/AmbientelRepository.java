package com.sysambientes.sysambientes.repository;


import com.sysambientes.sysambientes.model.Ambiente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface AmbientelRepository extends JpaRepository<Ambiente, Integer> {

	public	Optional<Ambiente> findById(Integer id);

	public	boolean existsById(Integer id);

	public	List<Ambiente> findAll();

	public	<S extends Ambiente> S save(S entity);

	public	void deleteById(Integer id);

}
