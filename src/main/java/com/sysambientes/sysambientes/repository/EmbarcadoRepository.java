package com.sysambientes.sysambientes.repository;


import com.sysambientes.sysambientes.model.Embarcado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface EmbarcadoRepository extends JpaRepository<Embarcado, Integer> {

	public	Optional<Embarcado> findById(Integer id);

	public	boolean existsById(Integer id);

	public	List<Embarcado> findAll();

	public	<S extends Embarcado> S save(S entity);

	public	void deleteById(Integer id);

}
