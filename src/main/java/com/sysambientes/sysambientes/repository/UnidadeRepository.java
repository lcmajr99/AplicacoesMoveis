package com.sysambientes.sysambientes.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sysambientes.sysambientes.model.Unidade;

import java.util.List;
import java.util.Optional;


@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Integer> {

    public Optional<Unidade> findById(Integer id);

    public boolean existsById(Integer id);

    public List<Unidade> findAll();

    public <S extends Unidade> S save(S entity);

    public void deleteById(Integer id);
}
