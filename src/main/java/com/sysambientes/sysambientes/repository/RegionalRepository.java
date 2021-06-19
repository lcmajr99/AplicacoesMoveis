package com.sysambientes.sysambientes.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sysambientes.sysambientes.model.Regional;


@Repository
public interface RegionalRepository extends JpaRepository<Regional, Integer> {

	public	Optional<Regional> findById(Integer id);

	public	boolean existsById(Integer id);

	public	List<Regional> findAll();

	public	<S extends Regional> S save(S entity);

	public	void deleteById(Integer id);

}
